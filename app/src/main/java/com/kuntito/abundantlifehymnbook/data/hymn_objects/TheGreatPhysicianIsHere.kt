package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object TheGreatPhysicianIsHere: Hymn() {
    private const val chorus = "Sweetest note in seraph song\n" +
            "Sweetest name on mortal tongue\n" +
            "Sweetest carol ever sung\n" +
            "Jesus, blessed Jesus"

	private val verse1 = HymnVerse(
        1,
        "The great physician now is here\n" +
                "The sympathizing Jesus\n" +
                "He speaks the drooping heart to cheer\n" +
                "oh! hear the voice of Jesus"
    )
	private val verse2 = HymnVerse(
        2,
        "You many sins are all forgiven\n" +
                "Oh! hear the voice of Jesus\n" +
                "Go on your way in peace to heaven\n" +
                "And wear a crown with Jesus"
    )
	private val verse3 = HymnVerse(
        3,
        "All glory to the risen lamb!\n" +
                "I now believe in Jesus\n" +
                "I love the blessed Savior's name\n" +
                "I love the name of Jesus"
    )
	private val verse4 = HymnVerse(
        4,
        "His name dispels my guilt and fear\n" +
                "No other name but Jesus\n" +
                "Oh! how my soul delights to hear\n" +
                "The charming name of Jesus"
    )
	
    override val id: Int = 50
    override val title = "The Great Physician Is Here"
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