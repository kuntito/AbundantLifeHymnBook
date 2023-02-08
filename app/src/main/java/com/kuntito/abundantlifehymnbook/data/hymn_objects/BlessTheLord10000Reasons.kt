package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object BlessTheLord10000Reasons: Hymn() {
    private const val chorus = "Bless the Lord, O my soul\n" +
            "O my soul, worship his holy name\n" +
            "Sing like never before, O my soul\n" +
            "I'll worship your holy name"

	private val verse1 = HymnVerse(
        1,
        "The sun comes up, it's a new day dawning\n" +
                "It's time to sing your song again\n" +
                "Whatever may pass and whatever lies before me\n" +
                "Let me be singing when the evening comes"
    )
	private val verse2 = HymnVerse(
        2,
        "You're rich in love and You're slow to anger\n" +
                "Your name is great and your heart is kind\n" +
                "For all your goodness I will keep on singing\n" +
                "Ten thousand reasons for my heart to find"
    )
	private val verse3 = HymnVerse(
        3,
        "And on that day when my strength is failing\n" +
                "The end draws near and my time has come\n" +
                "Still my soul sings your praise unending\n" +
                "Ten thousand years and then forevermore"
    )
	
    override val id: Int = 46
    override val title = "Bless The Lord (10,000 Reasons)"
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