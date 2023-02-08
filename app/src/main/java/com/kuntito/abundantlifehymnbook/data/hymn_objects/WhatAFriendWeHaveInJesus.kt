package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object WhatAFriendWeHaveInJesus: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "What a friend we have in Jesus\n" +
                "All our sins and grief's to bear\n" +
                "What a privilege to carry\n" +
                "Everything to God in prayer\n" +
                "Oh, what peace we often forfeit\n" +
                "Oh, what needless pain we bear\n" +
                "All because we do not carry\n" +
                "Everything to God in prayer"
    )
	private val verse2 = HymnVerse(
        2,
        "Have we trials and temptations?\n" +
                "Is there trouble anywhere?\n" +
                "We should never be discouraged\n" +
                "Take it to the Lord in prayer\n" +
                "Can we find a friend so faithful\n" +
                "Who will all our sorrows share?\n" +
                "Jesus know our every weakness\n" +
                "Take it to the Lord in prayer"
    )
	private val verse3 = HymnVerse(
        3,
        "Are we weak and heavy laden\n" +
                "Cumbered with a load of care\n" +
                "Precious Saviour, still our refuge\n" +
                "Take it to the Lord in prayer\n" +
                "Do thy friends despise, forsake thee?\n" +
                "Take it to the Lord in prayer\n" +
                "In his arms he'll take and shield thee\n" +
                "Thou wilt find a solace there"
    )
	
    override val id: Int = 34
    override val title = "What A Friend We Have In Jesus"
    override val lyrics = Lyrics(
        title,
        listOf(
			verse1,
			verse2,
			verse3
		)
    )
}