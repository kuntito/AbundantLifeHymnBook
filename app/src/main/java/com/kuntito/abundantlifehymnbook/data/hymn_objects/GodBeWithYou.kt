package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object GodBeWithYou: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "God be with you till we meet again\n" +
                "By his counsels guide, uphold you\n" +
                "With his sheep securely fold you\n" +
                "God be with you till we meet again"
    )
    private val verse2 = HymnVerse(
        2,
        "God be with you till we meet again\n" +
                "Neath his wings securely hide you\n" +
                "Daily manna still provide you\n" +
                "God be with you till we meet again"
    )
    private val verse3 = HymnVerse(
        3,
        "God be with you till we meet again\n" +
                "When life's perils thick confound you\n" +
                "Put his arms unfailing round you\n" +
                "God be with you till we meet again"
    )
    private val verse4 = HymnVerse(
        4,
        "God be with you till we meet again\n" +
                "Keep love's banner floating over you\n" +
                "Smite death's threatening wave before you\n" +
                "God be with you till we meet again"
    )
    override val id: Int = 7
    override val title = "God Be With You"
    override val lyrics = Lyrics(
        title,
        listOf(
            verse1,
            verse2,
            verse3,
            verse4
        )
    )
}