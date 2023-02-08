package com.kuntito.abundantlifehymnbook.data.models;

import java.lang.System;

/**
 * Enum class with different values to set search state based on text, focus, initial state and
 * results from search.
 *
 * **InitialResults** represents the initial state before search is initiated. This represents
 * the whole screen
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/kuntito/abundantlifehymnbook/data/models/SearchDisplay;", "", "(Ljava/lang/String;I)V", "SearchHistory", "Results", "NoResults", "app_release"})
public enum SearchDisplay {
    /*public static final*/ SearchHistory /* = new SearchHistory() */,
    /*public static final*/ Results /* = new Results() */,
    /*public static final*/ NoResults /* = new NoResults() */;
    
    SearchDisplay() {
    }
}