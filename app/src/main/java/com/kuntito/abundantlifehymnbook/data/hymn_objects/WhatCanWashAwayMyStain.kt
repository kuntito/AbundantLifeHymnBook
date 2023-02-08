package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object WhatCanWashAwayMyStain: Hymn() {
    private const val chorus = "Oh, precious is the flow that makes me white as snow\n" +
            "No other fount I know\n" +
            "Nothing but the blood of Jesus"

	private val verse1 = HymnVerse(
        1,
        "What can wash away my stain?\n" +
                "Nothing but the blood of Jesus\n" +
                "What can make me whole again?\n" +
                "Nothing but the blood of Jesus"
    )
	private val verse2 = HymnVerse(
        2,
        "For my cleansing this I see\n" +
                "Nothing but the blood of Jesus\n" +
                "For my pardon this my plea\n" +
                "Nothing but the blood of Jesus"
    )
	private val verse3 = HymnVerse(
        3,
        "Nothing can for sin atone\n" +
                "Nothing but the blood of Jesus\n" +
                "Nought of good that I have done\n" +
                "Nothing but the blood of Jesus"
    )
	private val verse4 = HymnVerse(
        4,
        "This is all my hope and peace\n" +
                "Nothing but the blood of Jesus\n" +
                "He is all my righteousness\n" +
                "Nothing but the blood of Jesus"
    )
	private val verse5 = HymnVerse(
        5,
        "Now by this I overcome\n" +
                "Nothing but the blood of Jesus\n" +
                "Now by this I'll reach my home\n" +
                "Nothing but the blood of Jesus"
    )
	
    override val id: Int = 35
    override val title = "What Can Wash Away My Stain"
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