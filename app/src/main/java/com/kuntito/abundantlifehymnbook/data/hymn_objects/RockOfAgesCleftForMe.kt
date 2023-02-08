package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object RockOfAgesCleftForMe: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "Rock of Ages, Cleft for me\n" +
                "Let me hide myself in thee!\n" +
                "Let the water and the blood\n" +
                "From thy riven side which flowed\n" +
                "Be of sin the double cure\n" +
                "Cleansed me from it's guilt and power"
    )
	private val verse2 = HymnVerse(
        2,
        "Not the labours of my hands\n" +
                "Can fulfill thy law's demands\n" +
                "Could my zeal on respite know\n" +
                "Could my tears for ever flow\n" +
                "All for sin could not atone\n" +
                "Thou must save and thou alone"
    )
	private val verse3 = HymnVerse(
        3,
        "Nothing in my hand I bring\n" +
                "Simply to thy cross I cling\n" +
                "Naked, come to thee for dress\n" +
                "Helpless, look to thee for grace\n" +
                "Foul, I to the fountain fly\n" +
                "Wash me, Saviour, or I die"
    )
	private val verse4 = HymnVerse(
        4,
        "While I draw this fleeting breath\n" +
                "When my eyelids close in death\n" +
                "When I soar to worlds unknown\n" +
                "See thee on thy judgement throne\n" +
                "Rock of Ages, Cleft for me\n" +
                "Let me hide myself in thee"
    )
	
    override val id: Int = 26
    override val title = "Rock Of Ages Cleft For Me"
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