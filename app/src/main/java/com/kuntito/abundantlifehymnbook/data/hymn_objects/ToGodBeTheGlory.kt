package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object ToGodBeTheGlory: Hymn() {
    private const val chorus = "Praise the Lord\n" +
            "Praise the Lord\n" +
            "Let the earth hear his voice\n" +
            "Praise the Lord\n" +
            "Praise the Lord\n" +
            "Let the people rejoice\n" +
            "O come to the father through Jesus the son\n" +
            "And give him the glory\n" +
            "Great things he hath done"

	private val verse1 = HymnVerse(
        1,
        "To God be the glory\n" +
                "Great things he hath done\n" +
                "So loved he the world that he gave us his son\n" +
                "Who yielded his life an atonement for sin\n" +
                "And opened the life gate that all may go in"
    )
	private val verse2 = HymnVerse(
        2,
        "O perfect redemption\n" +
                "The purchase of blood\n" +
                "To every believer the promise of God\n" +
                "The vilest offender who truly believes\n" +
                "That moment from Jesus a pardon receive"
    )
	private val verse3 = HymnVerse(
        3,
        "Great things he hath taught us\n" +
                "Great things he hath done\n" +
                "And great our rejoicing through Jesus the son\n" +
                "But pure, and higher, and greater will be\n" +
                "Our wonder, our transport when Jesus we see"
    )
	
    override val id: Int = 33
    override val title = "To God Be The Glory"
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