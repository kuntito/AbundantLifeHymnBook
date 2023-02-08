package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object JustAsIAmWithoutOnePlea: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "Just as I am, without one plea\n" +
                "but that thy blood was shed for me\n" +
                "and that thou bidd'st me come to thee\n" +
                "O Lamb of God, I come, I come"
    )
	private val verse2 = HymnVerse(
        2,
        "Just as I am, and waiting not\n" +
                "to rid my soul of one dark blot\n" +
                "to thee, whose blood can cleanse each spot\n" +
                "O Lamb of God, I come, I come"
    )
	private val verse3 = HymnVerse(
        3,
        "Just as I am, though tossed about\n" +
                "with many a conflict, many a doubt\n" +
                "fightings and fears within, without\n" +
                "O Lamb of God, I come, I come"
    )
	private val verse4 = HymnVerse(
        4,
        "Just as I am, thou wilt receive\n" +
                "wilt welcome, pardon, cleanse, relieve\n" +
                "because thy promise I believe\n" +
                "O Lamb of God, I come, I come"
    )
	
    override val id: Int = 41
    override val title = "Just As I Am, Without One Plea"
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