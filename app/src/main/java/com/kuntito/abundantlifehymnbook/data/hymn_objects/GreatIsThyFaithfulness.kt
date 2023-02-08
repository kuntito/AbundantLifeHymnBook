package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object GreatIsThyFaithfulness: Hymn() {
    private const val chorus = "Great is Thy faithfulness!\n" +
                "Great is Thy faithfulness!\n" +
                "Morning by morning new mercies I see\n" +
                "All I have needed Thy hand hath provided\n" +
                "Great is Thy faithfulness,\n" +
                "Lord, unto me!"

    private val verse1 = HymnVerse(
        1,
        "Great is thy faithfulness, O God my father\n" +
                "There is no shadow of turning with Thee\n" +
                "Thou changest not\n" +
                "Thy compassion, they fail not\n" +
                "As thou hast been Thou forever will be"
    )

    private val verse2 = HymnVerse(
        2,
        "Summer and Winter\n" +
                "And spring time and harvest\n" +
                "Sun, moon, and stars in their courses above\n" +
                "Join with all nature in manifold witness\n" +
                "To thy great faithfulness\n" +
                "Mercy and love"
    )

    private val verse3 = HymnVerse(
        3,
        "Pardon for sin and a peace that endureth\n" +
                "Thine own dear presence to cheer and to guide\n" +
                "Strength for today and bright hope for tomorrow\n" +
                "Blessing all mine\n" +
                "With ten thousand beside."
    )
    override var id: Int = 8
    override var title: String = "Great Is Thy Faithfulness"
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
