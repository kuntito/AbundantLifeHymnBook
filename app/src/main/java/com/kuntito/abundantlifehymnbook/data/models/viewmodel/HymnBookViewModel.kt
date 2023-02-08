package com.kuntito.abundantlifehymnbook.data.models.viewmodel

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kuntito.abundantlifehymnbook.data.AllHymns
import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnNotFound
import com.kuntito.abundantlifehymnbook.ui.composables.SearchState
import com.kuntito.abundantlifehymnbook.util.queryInLyrics
import com.kuntito.abundantlifehymnbook.util.queryInTitle

private const val TAG = "HymnBookViewModel"
class HymnBookViewModel: ViewModel() {
    val hymns = AllHymns.hymns
    val searchBarState: SearchState
    val hymnListState: LazyListState

    init {
        searchBarState = SearchState(
            query = TextFieldValue(""),
            focused = false,
            searching = false,
            searchResults = emptyList()
        )

        hymnListState = LazyListState()
    }

    private val _currentHymn = MutableLiveData<Hymn>()
    val currentHymn: LiveData<Hymn>
        get() = _currentHymn

    fun setCurrentHymn(hymnTitle: String) {
        val hymn = hymns.find {
            it.title == hymnTitle
        } ?: HymnNotFound

        _currentHymn.value = hymn
    }

    fun searchHymnBookQuery(query: String): List<Hymn> {
        val searchResult: MutableSet<Hymn> = mutableSetOf()

        if (query.isNotEmpty()) {
            for (hymn in hymns) {
                if (queryInTitle(query, hymn.title)
                    || queryInLyrics(query, hymn.lyrics) || query == hymn.id.toString()) {
                    searchResult.add(hymn)
                }
            }
        }

        return searchResult.toList()
    }

    private var _isNavFromHymnSearch = false
    val isNavFromHymnSearch
        get() = _isNavFromHymnSearch

    /** When navigating from a search result to lyrics, the search query should be cleared
    oddly enough, after it's cleared $changeQuery is sometimes called with the previously
    cleared argument. I'm not sure why  so i clear the search query within the `onStop` method
    of the `HymnLyricsFragment`
    Secondly, hymn searches are to be recorded but whenever i update search history in the
    `HymnListSearchFragment`, the update appears before navigation which is not the
    preferred behaviour, hence I do it after*/
    fun onNavFromHymnSearch(hymnTitle: String){
        searchBarState.addRecentSearch(hymnTitle)
        searchBarState.changeQuery(TextFieldValue(""))
        setIsNavFromHymnSearch(false)
    }

    fun setIsNavFromHymnSearch(flag: Boolean){
        _isNavFromHymnSearch = flag
    }
}