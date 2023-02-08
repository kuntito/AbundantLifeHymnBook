package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object OhLordMyGod: Hymn() {
    private const val chorus = "Then sings my soul\n" +
            "My saviour God to thee\n" +
            "How great thou art\n" +
            "How great thou art"

	private val verse1 = HymnVerse(
        1,
        "Oh, Lord my God when I in awesome wonder\n" +
                "Consider all the works thy hand has made\n" +
                "I see the star, I hear the roaring thunder\n" +
                "Thy works throughout the universe displayed"
    )
	private val verse2 = HymnVerse(
        2,
        "When through the woods and fores glades\n" +
                "I wonder\n" +
                "And hear the birds sing sweetly in the trees\n" +
                "When I look down from lofty mountain grandeur\n" +
                "And hear the brook and feel the gentle breeze"
    )
	private val verse3 = HymnVerse(
        3,
        "And when I think that God his son not sparing\n" +
                "Sent him to die, I scare can't take it in\n" +
                "That on the cross, my burden gladly bearing\n" +
                "He bled and died to take away my sins"
    )
	private val verse4 = HymnVerse(
        4,
        "When Christ shall come with shout of acclamation\n" +
                "To take me home what joy shall fill my heart\n" +
                "Then I shall bow in humble adoration\n" +
                "And there proclaim\n" +
                "My God how great thou art"
    )
	
    override val id: Int = 23
    override val title = "Oh Lord My God"
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