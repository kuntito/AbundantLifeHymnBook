package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object IsThereAHeartThatIsWaiting: Hymn() {
    private const val chorus = "Jesus is passing this way\n" +
            "This way.....to-day\n" +
            "Jesus is passing this way\n" +
            "Is passing this way to-day"

	private val verse1 = HymnVerse(
        1,
        "Is there a heart that is waiting\n" +
                "Longing for pardon today?\n" +
                "Hear the glad message proclaiming\n" +
                "Jesus is passing this way"
    )
	private val verse2 = HymnVerse(
        2,
        "Is there a heart that has wandered?\n" +
                "Come with thy burden today\n" +
                "Mercy is tenderly pleading\n" +
                "Jesus is passing this way"
    )
	private val verse3 = HymnVerse(
        3,
        "Is there a heart that is broken?\n" +
                "Weary and sighing for rest?\n" +
                "Come to the arms of thy savior\n" +
                "Pillow thy head on his breast"
    )
	private val verse4 = HymnVerse(
        4,
        "Come to thy only redeemer\n" +
                "Come to his infinite love\n" +
                "Come to the gaze that is leading\n" +
                "Homeward to mansions above"
    )
	
    override val id: Int = 14
    override val title = "Is There A Heart That Is Waiting"
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