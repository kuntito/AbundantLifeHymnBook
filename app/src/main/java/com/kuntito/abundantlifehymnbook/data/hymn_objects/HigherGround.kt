package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object HigherGround: Hymn() {
    private const val chorus = "Lord, lift me up, and let me stand\n" +
            "By faith on Heaven's tableland\n" +
            "A higher plain than I have found\n" +
            "Lord, plant my feet on higher ground"

	private val verse1 = HymnVerse(
        1,
        "I'm pressing on the upward way\n" +
                "New heights I'm gaining every day\n" +
                "Still praying as I onward bound\n" +
                "\"Lord, plant my feet on higher ground\""
    )
	private val verse2 = HymnVerse(
        2,
        "My heart has no desire to stay\n" +
                "Where doubts arise and fears dismay\n" +
                "Though some may dwell where these abound\n" +
                "My prayer, my aim, is higher ground"
    )
	private val verse3 = HymnVerse(
        3,
        "I want to live above the world\n" +
                "Though Satan's darts at me are hurled\n" +
                "For faith has caught the joyful sound\n" +
                "The song of saints on higher ground"
    )
	private val verse4 = HymnVerse(
        4,
        "I want to scale the utmost height\n" +
                "And catch a gleam of glory bright\n" +
                "But still I'll pray till rest I've found\n" +
                "Lord, lead me on to higher ground"
    )
	
    override val id: Int = 44
    override val title = "Higher Ground"
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