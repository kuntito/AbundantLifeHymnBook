package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object ItIsWellWithMySoul: Hymn() {
    private const val chorus = "It is well (It is well)\n" +
            "With my soul (With my soul)\n" +
            "It is well\n" +
            "It is well with my soul"

	private val verse1 = HymnVerse(
        1,
        "When peace, like a river\n" +
                "attendeth my way\n" +
                "when sorrows like sea billows roll\n" +
                "Whatever my lot\n" +
                "Thou hast taught me to say\n" +
                "It is well\n" +
                "It is well with my soul"
    )
	private val verse2 = HymnVerse(
        2,
        "Though satan should buffet\n" +
                "though trials should come\n" +
                "Let this blessed assurance control\n" +
                "That Christ has regarded\n" +
                "my helpless estate\n" +
                "And hath shed his own blood for my soul"
    )
	private val verse3 = HymnVerse(
        3,
        "My sin, oh the bliss\n" +
                "of this glorious thought!\n" +
                "My sin, not in part but the whole\n" +
                "is nailed to the cross\n" +
                "And I bear it no more\n" +
                "Praise the Lord, praise the Lord, O my soul"
    )
	private val verse4 = HymnVerse(
        4,
        "And Lord haste the day\n" +
                "when the faith shall be sight\n" +
                "The clouds be rolled back as a scroll\n" +
                "The trump shall resound\n" +
                "and the Lord shall descend\n" +
                "even so, it is well with my soul"
    )
	
    override val id: Int = 49
    override val title = "It Is Well With My Soul"
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