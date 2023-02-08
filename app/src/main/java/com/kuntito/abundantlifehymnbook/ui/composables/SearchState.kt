package com.kuntito.abundantlifehymnbook.ui.composables

import android.util.Log
import androidx.compose.runtime.*
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.text.input.TextFieldValue
import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.SearchDisplay
import com.kuntito.abundantlifehymnbook.ui.fragments.TAG

private const val max_queries = 15
@Stable
class SearchState(
    query: TextFieldValue,
    focused: Boolean,
    searching: Boolean,
    searchResults: List<Hymn>,
    val focusRequester: FocusRequester = FocusRequester()
) {
    private var _query by mutableStateOf(query)
    val query
        get() = _query
    fun changeQuery(query: TextFieldValue){
        Log.d(TAG, "oqc called - $query")
        _query = query
    }
    var focused by mutableStateOf(focused)
    var searching by mutableStateOf(searching)
    var searchResults by mutableStateOf(searchResults)

    fun initializeRecentSearches(recentSearchesSaved: List<String>){
        if (recentSearchesSaved.size <= max_queries ){
            _recentSearches.clear()
            _recentSearches.addAll(recentSearchesSaved)
        }
    }

    private val _recentSearches = mutableStateListOf<String>()
    val recentSearches
        get() = _recentSearches.toList()
    // search queries shouldn't exceed max_queries, in that case the oldest query should be removed
    fun addRecentSearch(hymnTitle: String){
        if (_recentSearches.size < max_queries){
            if (hymnTitle in _recentSearches){
                _recentSearches.remove(hymnTitle)
            }
            _recentSearches.add(0, hymnTitle)
        }else{
            _recentSearches.removeAt(_recentSearches.lastIndex)
            addRecentSearch(hymnTitle)
        }
    }

    fun removeRecentSearch(hymnTitle: String){
        if (hymnTitle in _recentSearches){
            _recentSearches.remove(hymnTitle)
        }else{
            Log.d(TAG, "$hymnTitle cannot be removed, it's not in search queries")
        }
    }

    fun clearRecentSearches(){
        _recentSearches.clear()
    }

    val searchDisplay: SearchDisplay
        get() = when {
            focused && query.text.isEmpty() -> SearchDisplay.SearchHistory
            searchResults.isEmpty() -> SearchDisplay.NoResults
            else -> SearchDisplay.Results
        }

    override fun toString(): String {
        return "🚀 State \n" +
                "query: $query\n" +
                "focused: $focused\n" +
                "searching: $searching\n" +
                "queries: ${recentSearches.size}\n" +
                "searchResults: ${searchResults.size}\n" +
                "searchDisplay: $searchDisplay"
    }
}