package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object OnwardChristianSoldiers: Hymn() {
    private const val chorus = "Onward Christian soldiers!\n" +
            "Marching as to war\n" +
            "Looking unto Jesus\n" +
            "Who is gone before"

	private val verse1 = HymnVerse(
        1,
        "Onward Christian soldiers!\n" +
                "Marching as to war\n" +
                "Looking unto Jesus\n" +
                "Who is gone before\n" +
                "Christ, the Royal Master\n" +
                "Leads against the foe\n" +
                "Forward into battle\n" +
                "See his banners go"
    )
	private val verse2 = HymnVerse(
        2,
        "At the name of Jesus\n" +
                "Satan's host doth flee\n" +
                "On then, Christian soldiers\n" +
                "On to victory!\n" +
                "Hell's foundations quiver\n" +
                "At the shout of praise\n" +
                "Brothers, left your voices\n" +
                "Loud your anthem raise"
    )
	private val verse3 = HymnVerse(
        3,
        "Like a mighty army\n" +
                "Moves the church of God\n" +
                "Brothers, are treading\n" +
                "Where the saints have trod\n" +
                "We are not divided\n" +
                "All one body we\n" +
                "One in hope and doctrine\n" +
                "One in charity"
    )
	private val verse4 = HymnVerse(
        4,
        "Crown and thrones may perish\n" +
                "Kingdoms rise and wane\n" +
                "But the church of Jesus\n" +
                "Constant will remain\n" +
                "Gates of hell can never\n" +
                "'Gainst that church prevail\n" +
                "We have Christ's own promise\n" +
                "And that cannot fail"
    )
	private val verse5 = HymnVerse(
        5,
        "Onward then, ye people\n" +
                "Join our happy throng\n" +
                "Blend with ours your voices\n" +
                "In the triumph song\n" +
                "Glory, praise and honour\n" +
                "Unto Christ the king\n" +
                "This, through countless ages\n" +
                "Men and angels sing"
    )
	
    override val id: Int = 22
    override val title = "Onward Christian Soldiers"
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