package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object MyHopeIsBuiltOnNothingLess: Hymn() {
    private const val chorus = "On Christ, the solid rock, I stand\n" +
            "All other ground is sinking sand\n" +
            "All other ground is sinking sand"

	private val verse1 = HymnVerse(
        1,
        "My hope is built on nothing less\n" +
                "Than Jesus' blood and righteousness\n" +
                "I dare not trust the sweetest frame\n" +
                "But wholly lean on Jesus' name"
    )
	private val verse2 = HymnVerse(
        2,
        "When darkness seems to veil his face\n" +
                "I rest on his unchanging grace\n" +
                "In every high and stormy gale\n" +
                "My anchors holds within the veil"
    )
	private val verse3 = HymnVerse(
        3,
        "His oath, His covenant, and blood\n" +
                "Support me in the whelming flood\n" +
                "When all around my soul gives way\n" +
                "He then is all my hope and stay"
    )
	private val verse4 = HymnVerse(
        4,
        "When he shall come with trumpet sound\n" +
                "Oh, may I then in him be found\n" +
                "Dressed in his righteousness alone\n" +
                "Faultless to stand before the throne"
    )
	
    override val id: Int = 19
    override val title = "My Hope Is Built On Nothing Less"
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