package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object MustIGoAndEmptyHanded: Hymn() {
    private const val chorus = "Must I go and empty handed?\n" +
            "Must i meet my saviour so?\n" +
            "Not one soul with which to greet him?\n" +
            "Must I empty handed go?"

	private val verse1 = HymnVerse(
        1,
        "Must I go and empty handed?\n" +
                "Thus my dear redeemer meet?\n" +
                "Not one day of service give him\n" +
                "Lay no trophy at his feet"
    )
	private val verse2 = HymnVerse(
        2,
        "Not at death I shrink or falter\n" +
                "For my saviour saves me now\n" +
                "But to meet him with empty-handed\n" +
                "Thought of that now clouds my brow"
    )//TODO review hymn lyrics
	private val verse3 = HymnVerse(
        3,
        "Oh, the years of sinning wasted\n" +
                "Could I but recall them now\n" +
                "I would give them to my saviour\n" +
                "To his will I'd gladly bow"
    )
	private val verse4 = HymnVerse(
        4,
        "Up, saints, arouse, be earnest\n" +
                "Up and work while yet tis' day\n" +
                "Ere the night of death over take you\n" +
                "Strive for souls while yet you may"
    )
	
    override val id: Int = 18
    override val title = "Must I Go- And Empty Handed"
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