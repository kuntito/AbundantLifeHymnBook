package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object SoftlyAndTenderly: Hymn() {
    private const val chorus = "come home...come home...\n" +
            "Ye who are weary, come home\n" +
            "Earnestly, tenderly Jesus is calling\n" +
            "Calling, sinners, come home"

	private val verse1 = HymnVerse(
        1,
        "Softly and tenderly Jesus is calling\n" +
                "Calling for you and for me\n" +
                "See, on the portals He's waiting and watching\n" +
                "Watching for you and for me"
    )
	private val verse2 = HymnVerse(
        2,
        "Many summers you have wasted, ripened\n" +
                "harvests you have seen\n" +
                "Winter snow by spring have melted\n" +
                "Yet you linger in your sin"
    )
	private val verse3 = HymnVerse(
        3,
        "Jesus for your choice is waiting\n" +
                "Tarry not at once decide!\n" +
                "While the spirit now is striving\n" +
                "Yield, and seek the saviour's side"
    )
	private val verse4 = HymnVerse(
        4,
        "Cease of fitness to be thinking\n" +
                "Do not longer try to feel\n" +
                "It is trusting, and not feeling\n" +
                "That will give the spirit seal"
    )
	private val verse5 = HymnVerse(
        5,
        "Let your will to God given\n" +
                "Trust in Christ's atoning blood\n" +
                "Look to Jesus now in heaven\n" +
                "Rest on his unchanging word"
    )
	
    override val id: Int = 29
    override val title = "Softly And Tenderly"
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