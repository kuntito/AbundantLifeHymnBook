package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object TrustAndObey: Hymn() {
    private const val chorus = "Trust and obey\n" +
            "For there's no other way\n" +
            "To be happy in Jesus\n" +
            "But to trust and obey"

	private val verse1 = HymnVerse(
        1,
        "When we walk with the Lord\n" +
                "In the light of his word\n" +
                "What a glory he shed on our way\n" +
                "While we do his good will\n" +
                "He abides with us still\n" +
                "And with all who will trust and obey"
    )
	private val verse2 = HymnVerse(
        2,
        "Not a shadow can rise\n" +
                "Not a cloud in the skies\n" +
                "But his smile quickly drives it away\n" +
                "Not a doubt or a fear\n" +
                "Not a sigh or a tear\n" +
                "Can abide while we trust and obey"
    )
	private val verse3 = HymnVerse(
        3,
        "Not a burden we bear\n" +
                "Not a sorrow we share\n" +
                "But our toil he doth richly repay\n" +
                "Not a grief or a loss\n" +
                "Not a frown or a cross\n" +
                "But is blest if we trust and obey"
    )
	private val verse4 = HymnVerse(
        4,
        "But we never can prove\n" +
                "The delights of his love\n" +
                "Until all on the altar we lay\n" +
                "For the favor he shows\n" +
                "And the joy he bestows\n" +
                "Are for them who will trust and obey"
    )
	private val verse5 = HymnVerse(
        5,
        "Then in fellowship sweet\n" +
                "We will sit at his feet\n" +
                "Or we'll walk by his side in the way\n" +
                "What he says we will do\n" +
                "Where he sends, we will go\n" +
                "Never fear, only trust and obey"
    )
	
    override val id: Int = 39
    override val title = "Trust And Obey"
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