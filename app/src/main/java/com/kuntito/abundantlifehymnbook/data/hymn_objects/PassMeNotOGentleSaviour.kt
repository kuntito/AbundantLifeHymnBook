package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object PassMeNotOGentleSaviour: Hymn() {
    private const val chorus = "Saviour, Saviour\n" +
            "Hear my humble cry\n" +
            "While on others thou art calling\n" +
            "Do not pass me by"

	private val verse1 = HymnVerse(
        1,
        "Pass me not, O gentle saviour\n" +
                "Hear my humble cry\n" +
                "While on others thou art calling\n" +
                "Do not pass me by"
    )
	private val verse2 = HymnVerse(
        2,
        "Let me, at thy throne of mercy\n" +
                "Find a sweet relief\n" +
                "Kneeling there in deep contrition\n" +
                "Help my unbelief"
    )
	private val verse3 = HymnVerse(
        3,
        "Trusting only in thy merit\n" +
                "Would I seek thy face\n" +
                "Heal my wounded broken spirit\n" +
                "Save me by thy grace"
    )
	private val verse4 = HymnVerse(
        4,
        "Thou, the spring of all my comfort\n" +
                "More than life to me\n" +
                "Whom have I on earth beside thee?\n" +
                "Whom in heaven but thee?"
    )
	
    override val id: Int = 24
    override val title = "Pass Me Not,  O Gentle Saviour"
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