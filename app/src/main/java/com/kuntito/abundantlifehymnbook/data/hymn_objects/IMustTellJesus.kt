package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object IMustTellJesus: Hymn() {
    private const val chorus = "I must tell Jesus! I must tell Jesus!\n" +
            "I cannot bear my burdens alone\n" +
            "I must tell Jesus! I must tell Jesus!\n" +
            "Jesus can help me, Jesus alone"

	private val verse1 = HymnVerse(
        1,
        "I must tell Jesus all of my trials\n" +
                "I cannot bear these burdens alone\n" +
                "In my distress he kindly will help me\n" +
                "He ever loves and cares for his own"
    )
	private val verse2 = HymnVerse(
        2,
        "I must tell Jesus all of my troubles\n" +
                "He is a kind, compassionate friend\n" +
                "If I but ask him, he will deliver\n" +
                "And in my griefs with me he will blend"
    )
	private val verse3 = HymnVerse(
        3,
        "Tempted and tried I need a great savior\n" +
                "One who help my burdens to bear\n" +
                "I must tell Jesus, I must tell Jesus\n" +
                "He all my cares and sorrows will share"
    )
	private val verse4 = HymnVerse(
        4,
        "O how the world to evil allures me!\n" +
                "O how my heart is tempted to sin!\n" +
                "I must tell Jesus, He will enable\n" +
                "Over the world the victory to win"
    )
	
    override val id: Int = 42
    override val title = "I Must Tell Jesus"
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