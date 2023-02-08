package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object MyFaithLookUpToThee: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "My faith look up to thee\n" +
                "Thou Lamb of calvary\n" +
                "Saviour divine\n" +
                "Now hear me while I pray\n" +
                "Take all my guilt away\n" +
                "Oh, let me from this day be wholly thine"
    )
	private val verse2 = HymnVerse(
        2,
        "May thy rich grace impart\n" +
                "Strength to my fainting heart\n" +
                "My zeal inspire, As thou hast died for me\n" +
                "Oh may love to thee pure warm\n" +
                "And changeless be a living fire"
    )
	private val verse3 = HymnVerse(
        3,
        "When life's dark maze i tread\n" +
                "And grief around me spread\n" +
                "Be thou my guide\n" +
                "Bid darkness turn to day\n" +
                "Wipe sorrow's tears away\n" +
                "Nor let me ever stray from thee aside"
    )
	private val verse4 = HymnVerse(
        4,
        "When ends life's transient dream\n" +
                "When death's cold, sullen stream\n" +
                "Shall over me roll\n" +
                "Blest Saviour, then in love\n" +
                "Fear and distrust remove\n" +
                "Oh, bear me safe above\n" +
                "A ransomed soul"
    )
	
    override val id: Int = 20
    override val title = "My Faith Look Up To Thee"
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