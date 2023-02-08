package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object HaveYouBeenToJesus: Hymn() {
    private const val chorus = "Are you washed...in the blood\n" +
                "in the soul-cleansing blood of the lamb?\n" +
                "Are your garments spotless\n" +
                "Are they as white as snow?\n" +
                "Are you washed in the blood of the lamb?"

    private val verse1 = HymnVerse(
        1,
        "Have you been to Jesus for the cleansing power?\n" +
                "Are you washed in the blood of the lamb?\n" +
                "Are you fully trusting in his grace this hour?\n" +
                "Are you washed in the blood of the lamb?"
    )
    private val verse2 = HymnVerse(
        2,
        "Are you walking daily by the savior's side?\n" +
                "Are you washed in the blood of the lamb?\n" +
                "Do you rest each moment in the crucified?\n" +
                "Are you washed in the blood of the lamb?"
    )
    private val verse3 = HymnVerse(
        3,
        "When the bridegroom cometh will\n" +
                "your robes be white?\n" +
                "Pure and white in the blood of the lamb?\n" +
                "Will your soul be ready for the mansion bright\n" +
                "And be washed in the blood of the lamb?"
    )
    private val verse4 = HymnVerse(
        4,
        "Lay aside the garments that are stained by sin\n" +
                "And be washed in the blood of the lamb\n" +
                "There's a fountain flowing for the soul unclean\n" +
                "Oh be washed in the blood of the Lamb"
    )

    override val id: Int = 11
    override val title = "Have You Been To Jesus"
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