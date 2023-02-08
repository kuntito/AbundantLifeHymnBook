package com.kuntito.abundantlifehymnbook.data.models

import java.io.Serializable

enum class HymnVerseType{
    Verse, Chorus
}

data class HymnVerse (
    val id: Int,
    val lines: String,
    val type: HymnVerseType = HymnVerseType.Verse
): Serializable{
    val stringId = when(type){
        HymnVerseType.Chorus -> "Chorus"
        HymnVerseType.Verse -> "Verse $id"
    }
}
