package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.HymnVerseType
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object AncientWords: Hymn() {
    private const val chorus = "Ancient words ever true\n" +
            "Changing me and changing you\n" +
            "We have come with open hearts\n" +
            "Oh, let the ancient words impart"

	private val verse1 = HymnVerse(
        1,
        "Holy words long preserved\n" +
                "For our walk in this world\n" +
                "They resound with God's own heart\n" +
                "Oh, let the ancient words impart"
    )
	private val verse2 = HymnVerse(
        2,
        "Words of life, words of hope\n" +
                "Give us strength, help us cope\n" +
                "In this world,d where e'er we roam\n" +
                "Ancient words will guide us home"
    )
	private val verse3 = HymnVerse(
        3,
        "Holy words of our faith\n" +
                "Handed down to this age\n" +
                "Came to us through sacrifice\n" +
                "Oh heed the faithful words of Christ"
    )

    private val verse4 = HymnVerse(
        4,
        "Holy words long preserved\n" +
                "For our walk in this world\n" +
                "They resound with God's own heart\n" +
                "Oh, let the ancient words impart"
    )

    override val id: Int = 48
    override val title = "Ancient Words"
    override val lyrics = Lyrics(
        title,
        listOf(
			verse1,
			verse2,
            HymnVerse(0, chorus, HymnVerseType.Chorus),
			verse3,
            verse4,
            HymnVerse(0, chorus, HymnVerseType.Chorus)
		)
    )
}