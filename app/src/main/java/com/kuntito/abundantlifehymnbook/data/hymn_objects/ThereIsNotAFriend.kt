package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object ThereIsNotAFriend: Hymn() {
    private const val chorus = "Jesus knows all about our struggles\n" +
            "He will guide till the day is done\n" +
            "There's not a friend like the lowly Jesus\n" +
            "No not one, No not one"

	private val verse1 = HymnVerse(
        1,
        "There's not a friend like the lowly Jesus\n" +
                "No not one, No not one\n" +
                "None else could heal all our hearts diseases\n" +
                "No not one, No not one"
    )
	private val verse2 = HymnVerse(
        2,
        "No friend like him is so high and holy\n" +
                "No not one, No not one\n" +
                "And yet no friend is so meek and lowly\n" +
                "No not one, No not one"
    )
	private val verse3 = HymnVerse(
        3,
        "There's not an hour that he is not near us\n" +
                "No not one, No not one\n" +
                "No night so dark but his love can cheer us\n" +
                "No not one, No not one"
    )
	private val verse4 = HymnVerse(
        4,
        "Did ever saint find this friend forsake him\n" +
                "No not one, No not one\n" +
                "Or sinner find that he would not take him\n" +
                "No not one, No not one"
    )
	
    override val id: Int = 31
    override val title = "There Is Not A Friend"
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