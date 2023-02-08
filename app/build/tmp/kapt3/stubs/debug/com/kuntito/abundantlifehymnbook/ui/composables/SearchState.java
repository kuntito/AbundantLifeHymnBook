package com.kuntito.abundantlifehymnbook.ui.composables;

import java.lang.System;

@androidx.compose.runtime.Stable()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0017J\u000e\u00101\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u00102\u001a\u00020/J\u0014\u00103\u001a\u00020/2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00170\bJ\u000e\u00105\u001a\u00020/2\u0006\u00100\u001a\u00020\u0017J\b\u00106\u001a\u00020\u0017H\u0016R+\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00038B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\b8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b*\u0010\u0014\u001a\u0004\b\'\u0010\"\"\u0004\b(\u0010)R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b-\u0010\u0014\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001d\u00a8\u00067"}, d2 = {"Lcom/kuntito/abundantlifehymnbook/ui/composables/SearchState;", "", "query", "Landroidx/compose/ui/text/input/TextFieldValue;", "focused", "", "searching", "searchResults", "", "Lcom/kuntito/abundantlifehymnbook/data/models/Hymn;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Landroidx/compose/ui/text/input/TextFieldValue;ZZLjava/util/List;Landroidx/compose/ui/focus/FocusRequester;)V", "<set-?>", "_query", "get_query", "()Landroidx/compose/ui/text/input/TextFieldValue;", "set_query", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "_query$delegate", "Landroidx/compose/runtime/MutableState;", "_recentSearches", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "getFocused", "()Z", "setFocused", "(Z)V", "focused$delegate", "getQuery", "recentSearches", "getRecentSearches", "()Ljava/util/List;", "searchDisplay", "Lcom/kuntito/abundantlifehymnbook/data/models/SearchDisplay;", "getSearchDisplay", "()Lcom/kuntito/abundantlifehymnbook/data/models/SearchDisplay;", "getSearchResults", "setSearchResults", "(Ljava/util/List;)V", "searchResults$delegate", "getSearching", "setSearching", "searching$delegate", "addRecentSearch", "", "hymnTitle", "changeQuery", "clearRecentSearches", "initializeRecentSearches", "recentSearchesSaved", "removeRecentSearch", "toString", "app_debug"})
public final class SearchState {
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.focus.FocusRequester focusRequester = null;
    private final androidx.compose.runtime.MutableState _query$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState focused$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState searching$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState searchResults$delegate = null;
    private final androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.String> _recentSearches = null;
    
    public SearchState(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.input.TextFieldValue query, boolean focused, boolean searching, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.kuntito.abundantlifehymnbook.data.models.Hymn> searchResults, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.focus.FocusRequester focusRequester) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.focus.FocusRequester getFocusRequester() {
        return null;
    }
    
    private final androidx.compose.ui.text.input.TextFieldValue get_query() {
        return null;
    }
    
    private final void set_query(androidx.compose.ui.text.input.TextFieldValue p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.input.TextFieldValue getQuery() {
        return null;
    }
    
    public final void changeQuery(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.input.TextFieldValue query) {
    }
    
    public final boolean getFocused() {
        return false;
    }
    
    public final void setFocused(boolean p0) {
    }
    
    public final boolean getSearching() {
        return false;
    }
    
    public final void setSearching(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kuntito.abundantlifehymnbook.data.models.Hymn> getSearchResults() {
        return null;
    }
    
    public final void setSearchResults(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.kuntito.abundantlifehymnbook.data.models.Hymn> p0) {
    }
    
    public final void initializeRecentSearches(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> recentSearchesSaved) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getRecentSearches() {
        return null;
    }
    
    public final void addRecentSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String hymnTitle) {
    }
    
    public final void removeRecentSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String hymnTitle) {
    }
    
    public final void clearRecentSearches() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kuntito.abundantlifehymnbook.data.models.SearchDisplay getSearchDisplay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}