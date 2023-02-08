package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object HeavenComeDown: Hymn() {
    private const val chorus = "Heaven came down and glory filled my soul\n" +
            "When at the cross the savior made me whole\n" +
            "My sins were washed away\n" +
            "And my night was turned to day\n" +
            "Heaven came down and glory filled my soul"

	private val verse1 = HymnVerse(
        1,
        "O what a wonderful day\n" +
                "Day I will never forget\n" +
                "After I'd wandered in darkness away\n" +
                "Jesus my savior I met\n" +
                "O what tender compassionate friend\n" +
                "He met the need of my heart\n" +
                "Shadows dispelling with joy I am telling\n" +
                "He made all the darkness depart"
    )
	private val verse2 = HymnVerse(
        2,
        "Born of the spirit with life from above\n" +
                "Into God's family divine\n" +
                "Justified fully through calvary's love\n" +
                "O what a standing is mine\n" +
                "And the transaction so quickly was made\n" +
                "When as a sinner I came\n" +
                "Took of the offer of grace\n" +
                "He did proffer he saved me\n" +
                "O praise his dear name"
    )
	private val verse3 = HymnVerse(
        3,
        "Now I've a hope that will surely endure\n" +
                "After the passing of time\n" +
                "I have a future in heaven for sure\n" +
                "There in those mansions sublime\n" +
                "And it's because of that wonderful day\n" +
                "When at the cross I believed\n" +
                "Riches eternal and blessings supernal\n" +
                "From his precious hand I received"
    )
	
    override val id: Int = 40
    override val title = "Heaven Come Down"
    override val lyrics = Lyrics(
        title,
        listOf(
			verse1,
			verse2,
			verse3
		),
		chorus

    )
}