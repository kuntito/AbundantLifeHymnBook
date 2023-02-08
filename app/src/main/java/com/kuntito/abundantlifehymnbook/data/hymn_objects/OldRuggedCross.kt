package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object OldRuggedCross: Hymn() {
    private const val chorus = "So I'l cherish the old rugged cross\n" +
            "till my trophies at last I lay down\n" +
            "I will cling to the old rugged cross\n" +
            "and exchange it some day for a crown"

	private val verse1 = HymnVerse(
        1,
        "On a hill far away stood an old rugged cross\n" +
                "the emblem of suffering and shame\n" +
                "and I love that old cross where the dearest and best\n" +
                "for a world of lost sinners was slain"
    )
	private val verse2 = HymnVerse(
        2,
        "O that old rugged cross, so despised by the world\n" +
                "has a wondrous attraction for me\n" +
                "for the dear Lamb of God left his glory above\n" +
                "to bear it to dark Calvary"
    )
	private val verse3 = HymnVerse(
        3,
        "In that old rugged cross, stained with blood so divine\n" +
                "a wondrous beauty I see\n" +
                "for 'twas on that old rugged cross Jesus suffered and died\n" +
                "to pardon and sanctify me"
    )
	private val verse4 = HymnVerse(
        4,
        "To that old rugged cross I will ever be true\n" +
                "its shame and reproach gladly bear\n" +
                "then he'll call me some day to my home far away\n" +
                "where his glory forever I'll share"
    )
	
    override val id: Int = 37
    override val title = "Old Rugged Cross"
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