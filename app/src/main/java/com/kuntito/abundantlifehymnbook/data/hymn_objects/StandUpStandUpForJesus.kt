package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object StandUpStandUpForJesus: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "Stand up, Stand Up for Jesus\n" +
                "Ye soldiers of the cross\n" +
                "Lift high his royal banner\n" +
                "It must not suffer loss\n" +
                "From victory unto victory\n" +
                "His army he shall lead\n" +
                "Till every foe is vanquished\n" +
                "And Christ is Lord indeed"
    )
	private val verse2 = HymnVerse(
        2,
        "Stand up, stand up for Jesus\n" +
                "The trumpet call obey\n" +
                "Forth to the mighty conflict\n" +
                "In this his glorious day!\n" +
                "Ye that are men, now serve him\n" +
                "Against unnumbered foes\n" +
                "Let courage rise with danger\n" +
                "And strength to strength oppose"
    )
	private val verse3 = HymnVerse(
        3,
        "Stand up, Stand up for Jesus\n" +
                "Stand in his strength alone\n" +
                "The arm of flesh will fail you\n" +
                "Ye dare not trust your own\n" +
                "Put on the gospel armor\n" +
                "Each piece put on with prayer\n" +
                "Where duty calls, or danger\n" +
                "Be never wanting there"
    )
	private val verse4 = HymnVerse(
        4,
        "Stand up, Stand up for Jesus\n" +
                "The strife will not be long\n" +
                "This day the noise of battle\n" +
                "The next the victor's song\n" +
                "To him that overcometh\n" +
                "A crown of life shall be\n" +
                "He with the king of glory\n" +
                "Shall reign eternally"
    )
	
    override val id: Int = 27
    override val title = "Stand Up,  Stand Up For Jesus"
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