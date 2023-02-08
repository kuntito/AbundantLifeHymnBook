package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object DeeperDeeperInTheLove: Hymn() {
    private const val chorus = "O deep...er yet I pray\n" +
                "And high...er every day\n" +
                "And wis...er, blessed Lord\n" +
                "In thy precious holy word"

    private val verse1 = HymnVerse(
        1,
        "Deeper, deeper in the love of\n" +
                "Jesus daily let me go\n" +
                "Higher, higher in the school of wisdom\n" +
                "More of grace to know"
    )
    private val verse2 = HymnVerse(
        2,
        "Deeper, deeper!\n" +
                "Blessed Holy Spirit take me deeper still\n" +
                "Till my life is wholly lost in Jesus\n" +
                "Let me fruitful grow"
    )
    private val verse3 = HymnVerse(
        3,
        "Deeper, deeper!\n" +
                "Though it cost hard trials Deeper let me go!\n" +
                "Rooted in the holy Love of Jesus\n" +
                "Let me fruitful grow"
    )
    private val verse4 = HymnVerse(
        4,
        "Deeper, higher every day in \n" +
                "Jesus, Till all conflicts past\n" +
                "Find me conqueror and in\n" +
                "His own image Perfected at last"
    )
    override val id: Int = 6
    override val title = "Deeper, Deeper In The Love"
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