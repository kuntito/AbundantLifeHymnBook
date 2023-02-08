package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object AlleluiaAlleluiaAlleluia: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "The strife is o'er, the battle is done\n" +
                "The victory of life is won\n" +
                "The song of triumph has begun\n" +
                "Alleluia!"
    )

    private val verse2 = HymnVerse(
        2,
        "The powers of death have done their worst\n" +
                "But Christ their legions hath dispersed\n" +
                "Let shouts of holy joy outburst\n" +
                "Alleluia!"
    )

    private val verse3 = HymnVerse(
        3,
        "The three sad days have quickly sped\n" +
                "He rises glorious from the dead\n" +
                "All glory to our risen head!\n" +
                "Alleluia!"
    )

    private val verse4 = HymnVerse(
        4,
        "He brake the age-bound chains of hell\n" +
                "The bars from heav'ens high and portals fell\n" +
                "Let hymns of praise his triumph tell\n" +
                "Alleluia!"
    )

    private val verse5 = HymnVerse(
        5,
        "Lord, by the stripes which wounded thee\n" +
                "From death's dread sting thy servants free\n" +
                "That we may live, and sing to thee\n" +
                "Alleluia!"
    )

    override val id: Int = 4
    override val title = "Alleluia!! Alleluia!! Alleluia!!"
    override val lyrics = Lyrics(
        title,
        listOf(
            verse1,
            verse2,
            verse3,
            verse4,
            verse5
            )
    )
}