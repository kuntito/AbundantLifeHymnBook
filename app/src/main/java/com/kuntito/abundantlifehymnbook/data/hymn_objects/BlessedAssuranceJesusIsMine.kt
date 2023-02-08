package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object BlessedAssuranceJesusIsMine: Hymn() {
    private const val chorus = "This is my story\n" +
                "This is my song\n" +
                "Praising my savior\n" +
                "All the day long"

    private val verse1 = HymnVerse(
        1,
        "Blessed assurance, Jesus is mine!\n" +
                "Oh what a foretaste of glory divine!\n" +
                "Heir of salvation, purchase of God\n" +
                "Born of his Spirit, washed in his blood"
    )
    private val verse2 = HymnVerse(
        2,
        "Perfect submission, perfect delight\n" +
                "Vision of rapture now burst on my sight\n" +
                "Angels descending, brings from above\n" +
                "Echoes of mercy, whispers of love"
    )
    private val verse3 = HymnVerse(
        3,
        "Perfect submission, all is at rest\n" +
                "I in my Saviour, I'm happy and blessed\n" +
                "Watching and waiting, looking above\n" +
                "Filled with his goodness\n" +
                "Lost in his love"
    )

    override val id: Int = 5
    override val title = "Blessed Assurance, Jesus Is Mine"
    override val lyrics = Lyrics(
        hymnTitle = title,
        verses = listOf(
            verse1,
            verse2,
            verse3
        ),
        chorus = chorus
    )
}