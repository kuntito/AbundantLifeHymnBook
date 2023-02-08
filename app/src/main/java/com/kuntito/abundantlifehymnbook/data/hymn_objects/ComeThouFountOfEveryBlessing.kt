package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object ComeThouFountOfEveryBlessing: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "Come, thou fount of every blessing\n" +
                "Tune my heart to sing thy grace\n" +
                "Streams of mercy, never ceasing\n" +
                "Call for songs of loudest praise\n" +
                "Teach me some melodious sonnet\n" +
                "Sung by flaming tongues above\n" +
                "Praise the mount I'm fixed upon it\n" +
                "Mount of Thy redeeming love"
    )
    private val verse2 = HymnVerse(
        2,
        "Here I raise my Ebenezer\n" +
                "Here by Thy great help I've come\n" +
                "Here by thy great help I've come\n" +
                "And I hope by Thy good pleasure\n" +
                "Safely to arrive at home\n" +
                "Jesus sought me when a stranger\n" +
                "Wandering from the fold of God\n" +
                "He to rescue me from danger\n" +
                "Interposed his precious blood"

    )
    private val verse3 = HymnVerse(
        3,
        "Oh, that day when freed from sinning\n" +
                "I shall see Thy lovely face\n" +
                "Clothed then in blood washed linen\n" +
                "How I'll sing Thy sovereign grace\n" +
                "Come my Lord, no longer tarry\n" +
                "Take my ransomed soul away\n" +
                "Send Thine angels now to carry\n" +
                "Me to realms of endless days"
    )
	private val verse4 = HymnVerse(
        4,
        "Oh, to grace how great a debtor\n" +
                "Daily I'm constrained to be!\n" +
                "Let thy goodness, like a fetter\n" +
                "bind my wandering heart to thee\n" +
                "prone to wander, Lord, I feel it\n" +
                "prone to leave the God I love\n" +
                "here's my heart, O take and seal it\n" +
                "seal it for thy courts above"
    )
	
    override val id: Int = 45
    override val title = "Come Thou Fount Of Every Blessing"
    override val lyrics = Lyrics(
        title,
        listOf(
			verse1,
			verse2,
			verse3,
            verse4
		)
    )
}