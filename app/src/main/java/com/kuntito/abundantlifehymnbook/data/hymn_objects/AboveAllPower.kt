package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object AboveAllPower: Hymn() {
    private const val chorus = "Crucified, laid behind a stone\n" +
                "You lived to die, rejected and alone\n" +
                "Like a rose, trampled on the ground\n" +
                "You took the fall, and thought of me\n" +
                "Above all"

    private val verse1 = HymnVerse(
        1,
        "Above all Powers, Above all Kings\n" +
                "Above all nature and all created things\n" +
                "Above all wealth and treasure of the earth\n" +
                "You were here before the world began\n" +
                "Above all kingdoms, Above all thrones\n" +
                "Above all wonders the world has ever known\n" +
                "Above all wisdom and all the ways of men\n" +
                "There's no way to measure what you're worth"
    )

    override val id: Int = 1
    override val title: String = "Above All Power"
    override val lyrics = Lyrics(
        title,
        listOf(
            verse1
        ),
        chorus
    )
}