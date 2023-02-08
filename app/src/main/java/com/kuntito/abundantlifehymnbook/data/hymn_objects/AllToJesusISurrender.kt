package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object AllToJesusISurrender: Hymn() {
    private const val chorus = "I surrender all\n" +
                "I surrender all\n" +
                "All to thee, my blessed saviour\n" +
                "I surrender all"

    private val verse1 = HymnVerse(
        1,
        "All to Jesus I surrender\n" +
                "All to him i freely give\n" +
                "I will ever love and trust him\n" +
                "In his presence daily live"
    )
    private val verse2 = HymnVerse(
        2,
        "All to Jesus I surrender\n" +
                "Humbly at his feet I bow\n" +
                "Worldly pleasure all forsaken\n" +
                "Take me, Jesus, take me now"
    )
    private val verse3 = HymnVerse(
        3,
        "All to Jesus I surrender\n" +
                "Lord I Give myself to Thee\n" +
                "Fill me with thy love and power\n" +
                "let thy blessing fall on me"
    )
    private val verse4 = HymnVerse(
        4,
        "All to Jesus I surrender\n" +
                "Now I feel the sacred flame\n" +
                "O the joy of full salvation!\n" +
                "Glory, glory to his love"
    )

    override val id: Int = 3
    override val title = "All To Jesus I Surrender"
    override val lyrics = Lyrics(
        title,
        listOf(
            verse1,
            verse2,
            verse3,
            verse4
        ),
        chorus
    )
}