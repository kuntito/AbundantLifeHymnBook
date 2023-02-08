package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object TisSoSweetToTrustInJesus: Hymn() {
    private const val chorus = "Jesus, Jesus, how I trust him\n" +
            "How I've proved him o'er and o'er\n" +
            "Jesus, Jesus, Precious Jesus!\n" +
            "O for grace to trust him more"

	private val verse1 = HymnVerse(
        1,
        "'Tis so sweet to trust in Jesus\n" +
                "Just to take him at his word\n" +
                "Just to rest upon his promise\n" +
                "Just to know, Thus saith the Lord"
    )
	private val verse2 = HymnVerse(
        2,
        "O how sweet to trust in Jesus\n" +
                "Just to trust his cleansing blood\n" +
                "Just in simple faith to plunge me\n" +
                "'Neath the healing, cleansing flood"
    )
	private val verse3 = HymnVerse(
        3,
        "Yes, 'tis sweet to trust in Jesus\n" +
                "Just from sin and self to cease\n" +
                "Just from Jesus simply taking\n" +
                "Life, and rest, and joy, and peace"
    )
	private val verse4 = HymnVerse(
        4,
        "I'm so glad I learned to trust thee\n" +
                "Precious Jesus, Savior, Friend\n" +
                "And I know that Thou art with me\n" +
                "Wilt be with me to the end"
    )
	
    override val id: Int = 38
    override val title = "Tis So Sweet To Trust In Jesus"
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