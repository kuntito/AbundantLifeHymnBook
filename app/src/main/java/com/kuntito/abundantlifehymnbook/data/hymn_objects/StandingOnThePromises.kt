package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object StandingOnThePromises: Hymn() {
    private const val chorus = "Stand...ing\n" +
            "Stand...ing\n" +
            "Standing on the promises of God my saviour\n" +
            "Stand...ing\n" +
            "Stand...ing\n" +
            "I'm standing on the promises of God"

	private val verse1 = HymnVerse(
        1,
        "Standing on the promises of Christ our king\n" +
                "Through eternal ages let his praise ring\n" +
                "Glory in the highest, I will shout and sing\n" +
                "Standing on the promises of God"
    )
	private val verse2 = HymnVerse(
        2,
        "Standing on the promises that can not fail\n" +
                "When the howling storms of doubt and fear assail\n" +
                "By the living word of God I shall prevail\n" +
                "Standing on the promises of God"
    )
	private val verse3 = HymnVerse(
        3,
        "Standing on the promises I now can see\n" +
                "Perfect, present cleansing in the blood for me\n" +
                "Standing, in the liberty where Christ, makes free\n" +
                "Standing on the promises of God"
    )
	private val verse4 = HymnVerse(
        4,
        "Standing on the promises of Christ the Lord\n" +
                "Bound to him eternally by love's strong cord\n" +
                "Overcoming daily with the spirit's sword\n" +
                "Standing on the promises of God"
    )
	private val verse5 = HymnVerse(
        5,
        "Standing on the promises I cannot fail\n" +
                "Listening every moment to the spirit's call\n" +
                "Resting in my saviour as my all in all\n" +
                "Standing on the promises of God"
    )
	
    override val id: Int = 28
    override val title = "Standing On The Promises"
    override val lyrics = Lyrics(
        title,
        listOf(
			verse1,
			verse2,
			verse3,
			verse4,
			verse5
		),
		chorus

    )
}