package com.kuntito.abundantlifehymnbook.data.models

import java.io.Serializable

data class Lyrics(
    var hymnTitle: String,
    private var verses: List<HymnVerse>,
    var chorus: String? = null
): Serializable {
    private var hasChorus: Boolean = this.chorus != null
    var numberOfVerses = this.verses.size ?: 0

    private val chorusAsVerse: HymnVerse
        get() = HymnVerse(
            id = 0,
            lines = chorus!!,
            type = HymnVerseType.Chorus
        )

    val lyrics: List<HymnVerse>
        get(){
            val res = verses.toMutableList()
            if (hasChorus){
                res.add(
                    chorusAsVerse
                )
            }
            return res.toList()
        }

    val lyricsChorusAfterEachVerse: List<HymnVerse>
        get() {
            val res = mutableListOf<HymnVerse>()
            return if (hasChorus){
                for (verse in verses){
                    res.add(verse)
                    res.add(chorusAsVerse)
                }
                res.toList()
            }else{
                lyrics
            }
        }
}
