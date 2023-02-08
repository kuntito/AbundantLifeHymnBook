package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object IAmSoGlad: Hymn() {
    private const val chorus = "I am so glad that Jesus loves me\n" +
            "Jesus loves me, Jesus loves me\n" +
            "I am so glad that Jesus loves me\n" +
            "Jesus loves even me"

	private val verse1 = HymnVerse(
        1,
        "I am so glad that our father in heaven\n" +
                "Tell of his love in the book he has given\n" +
                "Wonderful things in the bible I see\n" +
                "That is the dearest, that Jesus loves me"
    )
	private val verse2 = HymnVerse(
        2,
        "Jesus loves me and I know I love him\n" +
                "Love brought him down my lost soul to redeem\n" +
                "Yes, it was love that die on the tree\n" +
                "Oh, I am certain that Jesus loves me"
    )
	private val verse3 = HymnVerse(
        3,
        "In this assurance, I fnd sweetest rest\n" +
                "Trusting in Jesus I know I am blessed\n" +
                "Satan dismayed from my soul doth now flee\n" +
                "When I just tell him that Jesus loves me"
    )
	private val verse4 = HymnVerse(
        4,
        "Oh, If there's only one song I can sing\n" +
                "When in his beauty I see the great king\n" +
                "This shall my song in eternity be\n" +
                "Oh, what a wonder that Jesus loves me"
    )
	private val verse5 = HymnVerse(
        5,
        "If one should ask of me, How can i tell?\n" +
                "Glory to Jesus, know very well\n" +
                "God's Holy Spirit with mine doth agree\n" +
                "Constantly witnessing - Jesus loves me"
    )
	
    override val id: Int = 13
    override val title = "I Am So Glad"
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