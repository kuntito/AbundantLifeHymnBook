package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object HaveThineOwnWayLord: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "Have Thine own way, Lord!\n" +
                "Have Thine own way!\n" +
                "Thou art the potter\n" +
                "I am the clay\n" +
                "Mould me and make me\n" +
                "After Thy will\n" +
                "While I am waiting\n" +
                "Yielded and still"
    )
    private val verse2 = HymnVerse(
        2,
        "Have Thine own way, Lord!\n" +
                "Have Thine own way!\n" +
                "Search me and try me\n" +
                "Master, today!\n" +
                "Whiter than snow, Lord!\n" +
                "Wash me just now\n" +
                "As in Thy presence\n" +
                "Humbly I bow"
    )
    private val verse3 = HymnVerse(
        3,
        "Have Thine own way, Lord!\n" +
                "Have Thine own way!\n" +
                "Wounded and weary\n" +
                "Help me, I pray\n" +
                "Power, all power\n" +
                "Surely is Thine!\n" +
                "Touch me and heal me\n" +
                "Saviour Divine!"
    )
    private val verse4 = HymnVerse(
        4,
        "Have Thine own way, Lord!\n" +
                "Have Thine own way!\n" +
                "Hold over my being\n" +
                "Absolute sway\n" +
                "Fill with thy Spirit\n" +
                "Till all shall see\n" +
                "Christ only, always\n" +
                "Living in me!"
    )


    override val id: Int = 9
    override val title = "Have Thine Own Way, Lord"
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