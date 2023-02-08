package com.kuntito.abundantlifehymnbook.ui.composables;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001ap\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\b\u0010\u0012\u001a\u00020\u0001H\u0007\u001a\"\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0003\u001aZ\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\fH\u0007\u001a6\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0007\u00a8\u0006\u001a"}, d2 = {"SearchBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "query", "Landroidx/compose/ui/text/input/TextFieldValue;", "focused", "", "searching", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "onFocusChanged", "Lkotlin/Function1;", "onQueryChange", "onClearQuery", "Lkotlin/Function0;", "fontSize", "", "SearchBarPreview", "SearchHint", "SearchTextField", "rememberSearchState", "Lcom/kuntito/abundantlifehymnbook/ui/composables/SearchState;", "searchResults", "", "Lcom/kuntito/abundantlifehymnbook/data/models/Hymn;", "app_release"})
public final class SearchViewKt {
    
    @androidx.compose.runtime.Composable()
    public static final void SearchBar(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.input.TextFieldValue query, boolean focused, boolean searching, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.focus.FocusRequester focusRequester, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onFocusChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onQueryChange, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClearQuery, int fontSize) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SearchTextField(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.input.TextFieldValue query, boolean focused, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.focus.FocusRequester focusRequester, int fontSize, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onQueryChange, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onFocusChanged) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SearchHint(androidx.compose.ui.Modifier modifier, boolean focused, int fontSize) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.compose.runtime.Composable()
    public static final com.kuntito.abundantlifehymnbook.ui.composables.SearchState rememberSearchState(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.input.TextFieldValue query, boolean focused, boolean searching, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.kuntito.abundantlifehymnbook.data.models.Hymn> searchResults) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(widthDp = 360, heightDp = 640, showBackground = true)
    public static final void SearchBarPreview() {
    }
}