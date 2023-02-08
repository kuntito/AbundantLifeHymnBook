package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object IHaveFoundAFriendInJesus: Hymn() {
    private const val chorus = "I've found a friend in Jesus\n" +
            "He's everything to me\n" +
            "He's the fairest of ten thousand to my soul!\n" +
            "The \"Lilly of the valley\"\n" +
            "In Him alone I see\n" +
            "All I need to cleanse and make me fully whole\n" +
            "In sorrow He's my comfort, in trouble\n" +
            "He's my stay, He tells me every care\n" +
            "on Him to roll\n" +
            "He's the \"Lilly of the valley\"\n" +
            "the bright and morning star!\n" +
            "He's the fairest of ten thousand to my soul!"

	private val verse1 = HymnVerse(
        1,
        "In sorrow He's my comfort, in trouble\n" +
                "He's my stay\n" +
                "He tells me every care on him to roll\n" +
                "He's the \"Lilly of the valley\"\n" +
                "the bright and morning star!\n" +
                "He's the fairest of ten thousand to my soul"
    )
	private val verse2 = HymnVerse(
        2,
        "He all my grief has taken\n" +
                "And all my sorrow borne\n" +
                "In temptation He's my strong and mighty tower\n" +
                "I've all for him forsaken\n" +
                "I've all my idols torn\n" +
                "From my heart and now he keeps\n" +
                "me by his power\n" +
                "Though all the world forsake me\n" +
                "And Satan tempt me sore\n" +
                "Through Jesus I shall safely reach the goal\n" +
                "He's the \"Lilly of the valley\"\n" +
                "the bright and the morning star\n" +
                "He's the fairest of then thousand to my soul"
    )
	private val verse3 = HymnVerse(
        3,
        "He'll never, never leave me\n" +
                "Nor yet forsake me here\n" +
                "While I live by faith, and do his blessed will\n" +
                "A wall of fire about me\n" +
                "I've nothing now to fear. With his manna\n" +
                "He my hungry soul shall fill\n" +
                "When crowned at last in glory\n" +
                "I'll see his blessed face\n" +
                "Where rivers of delight shall ever roll\n" +
                "He's the \"Lilly of the valley\"\n" +
                "the bright and morning star\n" +
                "He's the fairest of ten thousand to my soul"
    )
	
    override val id: Int = 16
    override val title = "I Have Found A Friend In Jesus"
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