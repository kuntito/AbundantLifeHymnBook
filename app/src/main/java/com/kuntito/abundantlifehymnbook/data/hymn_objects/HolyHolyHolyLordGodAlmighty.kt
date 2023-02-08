package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object HolyHolyHolyLordGodAlmighty: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "Holy, Holy, Holy" +
                "Lord God Almighty!\n" +
                "Early in the morning our song\n" +
                "Shall rise to thee\n" +
                "Holy, Holy, Holy, merciful and mighty\n" +
                "God in three persons, blessed Trinity"
    )
    private val verse2 = HymnVerse(
        2,
        "Holy, Holy, Holy!\n" +
                "All the saints adore thee\n" +
                "Casting down their golden crowns\n" +
                "around the glassy sea\n" +
                "Cherubim and seraphim falling\n" +
                "down before thee\n" +
                "Which wert and art, and evermore shalt be"
    )
    private val verse3 = HymnVerse(
        3,
        "Holy, Holy, Holy!\n" +
                "Though the darkness hide thee\n" +
                "Though the eye of sinful man\n" +
                "Thy glory may not see\n" +
                "Only thou art holy\n" +
                "There is none beside thee\n" +
                "Perfect in power, in love and purity"
    )
    private val verse4 = HymnVerse(
        4,
        "Holy, Holy, Holy!\n" +
                "Lord God Almighty!\n" +
                "All thy works shall praise\n" +
                "Thy name in earth and sky and sea\n" +
                "Holy, Holy, Holy, Merciful and Mighty\n" +
                "God in three persons, blessed Trinity"
    )

    override val id: Int = 10
    override val title = "Holy, Holy, Holy, Lord God Almighty"
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