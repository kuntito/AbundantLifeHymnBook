package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object IAmThineOLord: Hymn() {
    private const val chorus = "Draw me near...er...nearer blessed Lord\n" +
            "To the cross where thou hast died\n" +
            "Draw me nearer, nearer, nearer, blessed Lord\n" +
            "To thy precious, bleeding side"

	private val verse1 = HymnVerse(
        1,
        "I am thine, O Lord, I have heard Thy Voice\n" +
                "And it told thy love to be but I long to rise\n" +
                "In the arms of faith and be\n" +
                "closer drawn to thee"
    )
	private val verse2 = HymnVerse(
        2,
        "Consecrate me now to thy service, Lord\n" +
                "By the power of grace divine, let my soul\n" +
                "Look up with steadfast hope\n" +
                "And my will be lost in thine"
    )
	private val verse3 = HymnVerse(
        3,
        "O the pure delight of a single hour,\n" +
                " that before thy throne I spend,\n" +
                "When I kneel in prayer, and with thee my God\n" +
                "I commune as friend with friend"
    )
	private val verse4 = HymnVerse(
        4,
        "There are depths of love that I cannot know\n" +
                "Till I cross the narrow sea\n" +
                "There are heights of joy that I may not reach\n" +
                "Till I rest in peace with thee"
    )
	
    override val id: Int = 15
    override val title = "I Am Thine,  O Lord!"
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