package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object JesusLoveTheLittleChildren: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "Jesus loves the little children\n" +
                "Once he took them on his knee\n" +
                "Gently put his arms around them on his knee\n" +
                "Gently put his arms around them\n" +
                "Sayin \"Let them come to me\""
    )
	private val verse2 = HymnVerse(
        2,
        "Oh! He loves to see them kneeling\n" +
                "And with hands together pray\n" +
                "Loves to hear them call him Jesus\n" +
                "If they mean the words they say"
    )
	private val verse3 = HymnVerse(
        3,
        "If they trust him as their savior\n" +
                "He will wash their sins away\n" +
                "He will take their hand and lead them\n" +
                "All along the narrow way"
    )
	private val verse4 = HymnVerse(
        4,
        "He would have them love each other\n" +
                "And be truthful, meek and mild\n" +
                "Doing as their parent bid them\n" +
                "As he did when once a child"
    )
	
    override val id: Int = 17
    override val title = "Jesus Love The Little Children"
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