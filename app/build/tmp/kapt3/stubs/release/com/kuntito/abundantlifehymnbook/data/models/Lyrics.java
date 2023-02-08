package com.kuntito.abundantlifehymnbook.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c2\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J/\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/kuntito/abundantlifehymnbook/data/models/Lyrics;", "Ljava/io/Serializable;", "hymnTitle", "", "verses", "", "Lcom/kuntito/abundantlifehymnbook/data/models/HymnVerse;", "chorus", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getChorus", "()Ljava/lang/String;", "setChorus", "(Ljava/lang/String;)V", "chorusAsVerse", "getChorusAsVerse", "()Lcom/kuntito/abundantlifehymnbook/data/models/HymnVerse;", "hasChorus", "", "getHymnTitle", "setHymnTitle", "lyrics", "getLyrics", "()Ljava/util/List;", "lyricsChorusAfterEachVerse", "getLyricsChorusAfterEachVerse", "numberOfVerses", "", "getNumberOfVerses", "()I", "setNumberOfVerses", "(I)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "app_release"})
public final class Lyrics implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String hymnTitle;
    private java.util.List<com.kuntito.abundantlifehymnbook.data.models.HymnVerse> verses;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String chorus;
    private boolean hasChorus;
    private int numberOfVerses;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kuntito.abundantlifehymnbook.data.models.Lyrics copy(@org.jetbrains.annotations.NotNull()
    java.lang.String hymnTitle, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kuntito.abundantlifehymnbook.data.models.HymnVerse> verses, @org.jetbrains.annotations.Nullable()
    java.lang.String chorus) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Lyrics(@org.jetbrains.annotations.NotNull()
    java.lang.String hymnTitle, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kuntito.abundantlifehymnbook.data.models.HymnVerse> verses, @org.jetbrains.annotations.Nullable()
    java.lang.String chorus) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHymnTitle() {
        return null;
    }
    
    public final void setHymnTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final java.util.List<com.kuntito.abundantlifehymnbook.data.models.HymnVerse> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getChorus() {
        return null;
    }
    
    public final void setChorus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getNumberOfVerses() {
        return 0;
    }
    
    public final void setNumberOfVerses(int p0) {
    }
    
    private final com.kuntito.abundantlifehymnbook.data.models.HymnVerse getChorusAsVerse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kuntito.abundantlifehymnbook.data.models.HymnVerse> getLyrics() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kuntito.abundantlifehymnbook.data.models.HymnVerse> getLyricsChorusAfterEachVerse() {
        return null;
    }
}