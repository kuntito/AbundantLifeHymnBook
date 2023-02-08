package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object FillMyCupLord: Hymn() {
    private const val chorus = "Fill my cup, Lord\n" +
            "I lift it up Lord\n" +
            "Come and quench this thirsting of my soul\n" +
            "Bread of heaven, feed me till I want no more\n" +
            "Fill my cup, fill it up and make me whole"

	private val verse1 = HymnVerse(
        1,
        "Like the woman at the well, I was seeking\n" +
                "For things that could not satisfy\n" +
                "And then I heard my savior speaking\n" +
                "\"Draw from my well that never shall run dry\""
    )
	private val verse2 = HymnVerse(
        2,
        "There are millions in this world who are seeking\n" +
                "For pleasures earthly goods afford\n" +
                "But none can match the wondrous treasure\n" +
                "That I find in Jesus Christ my Lord"
    )
	private val verse3 = HymnVerse(
        3,
        "So my brother if the things that this world gives you\n" +
                "Leave hungers that won't pass away\n" +
                "My blessed Lord will come and save you\n" +
                "If you kneel to him and humbly pray"
    )
	
    override val id: Int = 43
    override val title = "Fill My Cup, Lord"
    override val lyrics = Lyrics(
        title,
        listOf(
			verse1,
			verse2,
			verse3
		),
		chorus

    )
}