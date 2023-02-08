package com.kuntito.abundantlifehymnbook.data.models

abstract class Hymn{
    abstract val id: Int
    abstract val title: String
    abstract val lyrics: Lyrics
}

object HymnNotFound: Hymn(){
    override val id: Int
        get() = 0
    override val title: String
        get() = "Unknown Hymn"
    override val lyrics: Lyrics
        get() = Lyrics(
            hymnTitle = "Unknown Hymn",
            verses = emptyList()
        )
}

