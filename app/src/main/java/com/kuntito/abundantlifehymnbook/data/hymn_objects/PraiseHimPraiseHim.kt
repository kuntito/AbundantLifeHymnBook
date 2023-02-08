package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object PraiseHimPraiseHim: Hymn() {
    private const val chorus = "Praise Him! Praise Him!\n" +
            "Tell of his excellent greatness\n" +
            "Praise Him, praise Him!\n" +
            "Ever in joyful sing"

	private val verse1 = HymnVerse(
        1,
        "Praise Him, Praise Him\n" +
                "Jesus our blessed redeemer\n" +
                "Sing, O earth, His wonderful love proclaim\n" +
                "Heal Him! Hail Him! Highest arch-angel in glory\n" +
                "Strength and honour give to his holy name!\n" +
                "Like a shepherd, Jesus will guard his children\n" +
                "In his arms he carries them all day long"
    )
	private val verse2 = HymnVerse(
        2,
        "Praise Him, Praise Him\n" +
                "Jesus, Our blessed redeemer\n" +
                "For our sins he suffered and bled and died\n" +
                "He, our rock, our hope of eternal salvation\n" +
                "Hail him, Hail him! Jesus the crucified\n" +
                "Loving saviour, meekly enduring sorrows\n" +
                "Crowned with thorns that cruelly pierced\n" +
                "His brow, Once for us rejected\n" +
                "Despised and forsaken, Prince of Glory\n" +
                "Ever triumphant now"
    )
	private val verse3 = HymnVerse(
        3,
        "Praise Him, Praise Him!\n" +
                "Jesus, Our blessed redeemer\n" +
                "Heavenly portals loud with hosannas ring\n" +
                "Jesus, Saviour, reigneth for ever and ever\n" +
                "Crown him, Crown Him\n" +
                "Prophet and Priest and King!\n" +
                "Death is vanquished tell it with joy, ye faithful\n" +
                "Where is now thy victory, boasting grave?\n" +
                "Jesus lives, the mighty and strong to save"
    )
	
    override val id: Int = 25
    override val title = "Praise Him,  Praise Him"
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