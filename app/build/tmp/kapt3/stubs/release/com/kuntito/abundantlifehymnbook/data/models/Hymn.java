package com.kuntito.abundantlifehymnbook.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/kuntito/abundantlifehymnbook/data/models/Hymn;", "", "()V", "id", "", "getId", "()I", "lyrics", "Lcom/kuntito/abundantlifehymnbook/data/models/Lyrics;", "getLyrics", "()Lcom/kuntito/abundantlifehymnbook/data/models/Lyrics;", "title", "", "getTitle", "()Ljava/lang/String;", "app_release"})
public abstract class Hymn {
    
    public Hymn() {
        super();
    }
    
    public abstract int getId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTitle();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.kuntito.abundantlifehymnbook.data.models.Lyrics getLyrics();
}