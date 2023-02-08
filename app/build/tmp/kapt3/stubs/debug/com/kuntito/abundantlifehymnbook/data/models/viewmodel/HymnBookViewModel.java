package com.kuntito.abundantlifehymnbook.data.models.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u001f\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006#"}, d2 = {"Lcom/kuntito/abundantlifehymnbook/data/models/viewmodel/HymnBookViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_currentHymn", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kuntito/abundantlifehymnbook/data/models/Hymn;", "_isNavFromHymnSearch", "", "currentHymn", "Landroidx/lifecycle/LiveData;", "getCurrentHymn", "()Landroidx/lifecycle/LiveData;", "hymnListState", "Landroidx/compose/foundation/lazy/LazyListState;", "getHymnListState", "()Landroidx/compose/foundation/lazy/LazyListState;", "hymns", "", "getHymns", "()Ljava/util/List;", "isNavFromHymnSearch", "()Z", "searchBarState", "Lcom/kuntito/abundantlifehymnbook/ui/composables/SearchState;", "getSearchBarState", "()Lcom/kuntito/abundantlifehymnbook/ui/composables/SearchState;", "onNavFromHymnSearch", "", "hymnTitle", "", "searchHymnBookQuery", "query", "setCurrentHymn", "setIsNavFromHymnSearch", "flag", "app_debug"})
public final class HymnBookViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.kuntito.abundantlifehymnbook.data.models.Hymn> hymns = null;
    @org.jetbrains.annotations.NotNull()
    private final com.kuntito.abundantlifehymnbook.ui.composables.SearchState searchBarState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.foundation.lazy.LazyListState hymnListState = null;
    private final androidx.lifecycle.MutableLiveData<com.kuntito.abundantlifehymnbook.data.models.Hymn> _currentHymn = null;
    private boolean _isNavFromHymnSearch = false;
    
    public HymnBookViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kuntito.abundantlifehymnbook.data.models.Hymn> getHymns() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kuntito.abundantlifehymnbook.ui.composables.SearchState getSearchBarState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.foundation.lazy.LazyListState getHymnListState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kuntito.abundantlifehymnbook.data.models.Hymn> getCurrentHymn() {
        return null;
    }
    
    public final void setCurrentHymn(@org.jetbrains.annotations.NotNull()
    java.lang.String hymnTitle) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kuntito.abundantlifehymnbook.data.models.Hymn> searchHymnBookQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    public final boolean isNavFromHymnSearch() {
        return false;
    }
    
    /**
     * When navigating from a search result to lyrics, the search query should be cleared
     *   oddly enough, after it's cleared $changeQuery is sometimes called with the previously
     *   cleared argument. I'm not sure why  so i clear the search query within the `onStop` method
     *   of the `HymnLyricsFragment`
     *   Secondly, hymn searches are to be recorded but whenever i update search history in the
     *   `HymnListSearchFragment`, the update appears before navigation which is not the
     *   preferred behaviour, hence I do it after
     */
    public final void onNavFromHymnSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String hymnTitle) {
    }
    
    public final void setIsNavFromHymnSearch(boolean flag) {
    }
}