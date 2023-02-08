package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object ImmortalInvisibleGod: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "Immortal, Invisible, God only wise\n" +
                "In light inaccessible his from our eyes\n" +
                "Most blessed, Most glorious, The Ancient of Days\n" +
                "Almighty, Victorious, Thy great name we praise"
    )
	private val verse2 = HymnVerse(
        2,
        "Unresting, Unhasting, And silent as light\n" +
                "Nor wanting, nor wasting, Thou rulest in might!\n" +
                "Thy justice like mountains are high soaring above\n" +
                "Thy clouds which are fountains of goodness\n" +
                "And love"
    )
	private val verse3 = HymnVerse(
        3,
        "To all life thou givest to both great and small\n" +
                "In all life thou livest, the true life of all\n" +
                "We blossom and flourish as leaves on the tree\n" +
                "And wither and perish but nought changeth thee"
    )
	private val verse4 = HymnVerse(
        4,
        "Great Father of glory, Pure father of light\n" +
                "Thine angels adore thee, All veiling in their sight\n" +
                "All laud we would render, O help us to see\n" +
                "'Tis only the splendour of light hideth thee"
    )
	private val verse5 = HymnVerse(
        5,
        "Immortal, Invisible, God only wise\n" +
                "In light inaccessible hid from our eyes\n" +
                "Most blessed, Most glorious\n" +
                "The ancient of days, Almighty\n" +
                "Victorious, Thy great name we praise"
    )
	
    override val id: Int = 12
    override val title = "Immortal,  Invisible,  God"
    override val lyrics = Lyrics(
        title,
        listOf(
			verse1,
			verse2,
			verse3,
			verse4,
			verse5
		)
    )
}