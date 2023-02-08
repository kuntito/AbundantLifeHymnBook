package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object ThereShallBeShowersOfBlessing: Hymn() {
    private const val chorus = "Show...ers of blessing\n" +
            "Showers of blessing we need\n" +
            "Mercy drops round us are falling\n" +
            "But for the shower we plead"
    private val verse1 = HymnVerse(
        1,
        "There shall be showers of blessing\n" +
                "This is the promise of love\n" +
                "There shall be season refreshing\n" +
                "Sent from the saviour above"
    )
    private val verse2 = HymnVerse(
        2,
        "There shall be showers of blessing\n" +
                "Precious reviving again\n" +
                "Over the hills and the valleys\n" +
                "Sound of abundance of rain"
    )
    private val verse3 = HymnVerse(
        3,
        "There shall be showers of blessing\n" +
                "Send them upon us, O Lord!\n" +
                "Grant to us now a refreshing\n" +
                "Come, and now honour thy word"
    )
    private val verse4 = HymnVerse(
        4,
        "There shall be showers of blessing\n" +
                "Oh, that to-day they might fall\n" +
                "Now, as to God, we are confessing\n" +
                "Now as to Jesus we call"
    )
    private val verse5 = HymnVerse(
        5,
        "There shall be showers of blessing\n" +
                "I we but trust and obey\n" +
                "There shall be seasons refreshing\n" +
                "If we let God have his way"
    )

    override val id: Int = 32
    override val title = "There Shall Be Showers Of Blessing"
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