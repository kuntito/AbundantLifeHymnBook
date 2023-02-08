package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object TakeMyLifeLetItBe: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "Take my life, and let it be\n" +
                "Consecrated, Lord to thee\n" +
                "Take my moments and my days\n" +
                "Let them flow in ceaseless praise"
    )
	private val verse2 = HymnVerse(
        2,
        "Take my hands and let them move\n" +
                "At the impulse of thy love\n" +
                "Take my feet and let them be\n" +
                "Filled with messages from thee"
    )
	private val verse3 = HymnVerse(
        3,
        "Take my voice and let me sing\n" +
                "Always, only, for my king\n" +
                "Take my lips and let them be\n" +
                "Filled with messages from thee"
    )
	private val verse4 = HymnVerse(
        4,
        "Take my silver and my gold\n" +
                "Not a mite would I withhold\n" +
                "Take my intellect and use\n" +
                "Every power as thou shalt choose"
    )
	private val verse5 = HymnVerse(
        5,
        "Take my will and make it thine\n" +
                "It shall be no longer mine\n" +
                "Take my heart, It is thine own\n" +
                "It shall by thy royal throne"
    )
	private val verse6 = HymnVerse(
        6,
        "Take my love, My Lord I pour\n" +
                "At thy feet its treasure store\n" +
                "Take myself, and I will be\n" +
                "Ever, only, all for thee"
    )
	
    override val id: Int = 30
    override val title = "Take My Life,  Let It Be"
    override val lyrics = Lyrics(
        title,
        listOf(
			verse1,
			verse2,
			verse3,
			verse4,
			verse5,
			verse6
		)
    )
}