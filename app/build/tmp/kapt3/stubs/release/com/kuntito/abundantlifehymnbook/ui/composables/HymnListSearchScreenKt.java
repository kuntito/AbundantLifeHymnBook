package com.kuntito.abundantlifehymnbook.ui.composables;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0018\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0094\u0001\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\f0\u0013H\u0007\u001a\b\u0010\u001a\u001a\u00020\u0001H\u0007\u001a6\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u0013H\u0007\u001a\b\u0010\u001f\u001a\u00020\u0001H\u0007\u001a%\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00010\u0017\u00a2\u0006\u0002\b\"H\u0007\u001a\u001a\u0010#\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001aB\u0010$\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010%\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u0013H\u0007\u001ad\u0010&\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0007\u001a.\u0010\'\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0007\u001a\b\u0010)\u001a\u00020\u0001H\u0007\u001a.\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00192\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\b\u0010,\u001a\u00020\u0001H\u0007\u00a8\u0006-"}, d2 = {"DividerItem", "", "HymnListHeader", "HymnListSearchScreen", "viewModel", "Lcom/kuntito/abundantlifehymnbook/data/models/viewmodel/HymnBookViewModel;", "navController", "Landroidx/navigation/NavController;", "HymnListSearchScreenContent", "modifier", "Landroidx/compose/ui/Modifier;", "hymnTitles", "", "", "searchBarState", "Lcom/kuntito/abundantlifehymnbook/ui/composables/SearchState;", "hymnListState", "Landroidx/compose/foundation/lazy/LazyListState;", "onClickHymnTitle", "Lkotlin/Function1;", "onSearchResultClick", "onRemoveSearchItem", "onClearHistory", "Lkotlin/Function0;", "searchHymnBookQuery", "Lcom/kuntito/abundantlifehymnbook/data/models/Hymn;", "HymnListSearchScreenPreview", "HymnTitleRow", "hymnNumber", "", "hymnTitle", "HymnTitleRowPreview", "LazyColumnShape", "content", "Landroidx/compose/runtime/Composable;", "LogoAndSearchBar", "RecentSearchItem", "hymnSearched", "SearchDisplayDropdown", "SearchHistoryHeader", "recentSearches", "SearchHistoryItemPreview", "SearchResultItem", "hymn", "SearchResultItemPreview", "app_release"})
public final class HymnListSearchScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void HymnListSearchScreen(@org.jetbrains.annotations.NotNull()
    com.kuntito.abundantlifehymnbook.data.models.viewmodel.HymnBookViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void HymnListSearchScreenContent(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> hymnTitles, @org.jetbrains.annotations.NotNull()
    com.kuntito.abundantlifehymnbook.ui.composables.SearchState searchBarState, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.lazy.LazyListState hymnListState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickHymnTitle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchResultClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onRemoveSearchItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClearHistory, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, ? extends java.util.List<? extends com.kuntito.abundantlifehymnbook.data.models.Hymn>> searchHymnBookQuery) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SearchDisplayDropdown(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.kuntito.abundantlifehymnbook.ui.composables.SearchState searchBarState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchResultClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickHymnTitle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onRemoveSearchItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClearHistory) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SearchHistoryHeader(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> recentSearches, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClearHistory) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LazyColumnShape(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void RecentSearchItem(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.lang.String hymnSearched, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickHymnTitle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onRemoveSearchItem) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SearchResultItem(@org.jetbrains.annotations.NotNull()
    com.kuntito.abundantlifehymnbook.data.models.Hymn hymn, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchResultClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DividerItem() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void HymnListHeader() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void HymnTitleRow(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, int hymnNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String hymnTitle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickHymnTitle) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LogoAndSearchBar(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.kuntito.abundantlifehymnbook.ui.composables.SearchState searchBarState) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void SearchHistoryItemPreview() {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void SearchResultItemPreview() {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void HymnTitleRowPreview() {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(backgroundColor = 4279440438L)
    public static final void HymnListSearchScreenPreview() {
    }
}