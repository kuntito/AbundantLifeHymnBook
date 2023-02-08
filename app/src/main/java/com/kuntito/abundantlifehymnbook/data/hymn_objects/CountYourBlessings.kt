package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object CountYourBlessings: Hymn() {
    private const val chorus = "Count your blessings\n" +
            "Name them one by one\n" +
            "Count your blessings\n" +
            "See what God hath done\n"

	private val verse1 = HymnVerse(
        1,
        "When upon life's billows you are tempest-tossed\n" +
                "When you are discouraged, thinking all is lost\n" +
                "Count your many blessings, name them one by one\n" +
                "And it will surprise you what the Lord has done"
    )
	private val verse2 = HymnVerse(
        2,
        "Are you ever burdened with a load of care?\n" +
                "Does the cross seem heavy you are called to bear?\n" +
                "Count your blessings; every doubt will fly\n" +
                "And you will be singing as the days go by"
    )
	private val verse3 = HymnVerse(
        3,
        "When you look at others with their lands and gold\n" +
                "Think that Christ has promised you his wealth untold\n" +
                "Count your blessings, money cannot buy\n" +
                "Your reward in heaven nor your home on high"
    )
	private val verse4 = HymnVerse(
        4,
        "So amid the conflict, whether great or small\n" +
                "Do not be discouraged; God is over all\n" +
                "Count your many blessings; angels will attend\n" +
                "Help and comfort give you to your journey's end"
    )
	
    override val id: Int = 47
    override val title = "Count Your Blessings"
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