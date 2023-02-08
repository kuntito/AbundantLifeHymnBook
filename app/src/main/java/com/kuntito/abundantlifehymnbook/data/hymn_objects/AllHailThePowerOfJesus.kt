package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object AllHailThePowerOfJesus: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "All hail the power of Jesus' name!\n" +
                "Let angels prostrate fall\n" +
                "Bring forth the royal diadem\n" +
                "And crown him Lord of all\n" +
                "Bring forth the royal diadem\n" +
                "And crown him Lord of all"
    )
    private val verse2 = HymnVerse(
        2,
        "Crown him, ye martyrs of our God\n" +
                "Who from his altar call\n" +
                "Extol the stem of Jesse's rod\n" +
                "And Crown him Lord of all\n" +
                "Extol the stem of Jesus' rod\n" +
                "And Crown him Lord of all"
    )
    private val verse3 = HymnVerse(
        3,
        "Ye chosen seed of Israel's race\n" +
                "A remnant weak and small\n" +
                "Hail him who saves you by his grace\n" +
                "And crown him Lord of all\n" +
                "Hail him who saves you by his grace\n" +
                "And crown him Lord of all"
    )
    private val verse4 = HymnVerse(
        4,
        "Ye gentile sinners, never forget\n" +
                "The wormwood and the gait\n" +
                "Go, spread your trophies at his feet\n" +
                "And crown him Lord of all\n" +
                "Go, spread your trophies at his feet\n" +
                "And crown him Lord of all"
    )
    private val verse5 = HymnVerse(
        5,
        "Let every kindred, every tribe\n" +
                "On this terrestrial ball\n" +
                "To him all majesty ascribe\n" +
                "and crown him Lord of all\n" +
                "To him all majesty ascribe\n" +
                "And crown him Lord of all"
    )
    private val verse6 = HymnVerse(
        6,
        "O that with yonder sacred throng\n" +
                "We at his feet may fall\n" +
                "Join in the everlasting song\n" +
                "And crown him Lord of all\n" +
                "Join in the everlasting song\n" +
                "And crown him Lord of all"
    )

    override val id: Int = 2
    override val title = "All Hail The Power Of Jesus"
    override val lyrics = Lyrics(
        title,
        listOf(
            verse1,
            verse2,
            verse3,
            verse4,
            verse5,
            verse6
        )
    )
}