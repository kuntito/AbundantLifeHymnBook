package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics


object OGodOurHelp: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "O God, our help in ages past\n" +
                "Our hope for years to come\n" +
                "Our shelter from the stormy blast\n" +
                "And our eternal home"
    )
	private val verse2 = HymnVerse(
        2,
        "Under the shadow of thy throne\n" +
                "Thy saints have dwelt secure\n" +
                "Sufficient is thine arm alone\n" +
                "And our defence is sure"
    )
	private val verse3 = HymnVerse(
        3,
        "Before the hills in order stood\n" +
                "Or earth received her frame\n" +
                "From everlasting thou art God\n" +
                "To endless years the same"
    )
	private val verse4 = HymnVerse(
        4,
        "A thousand ages in thy sight\n" +
                "Are like an evening gone\n" +
                "Short as the watch that ends the night\n" +
                "Before the rising sun"
    )
	private val verse5 = HymnVerse(
        5,
        "Time like an ever-rolling stream\n" +
                "Bears all its sons away\n" +
                "They fly forgotten, as a dream\n" +
                "Dies at the opening day"
    )
	private val verse6 = HymnVerse(
        6,
        "O God, our help in ages past\n" +
                "Our hope for years to come\n" +
                "Be thou our guard while troubles last\n" +
                "And our eternal home"
    )
	
    override val id: Int = 21
    override val title = "O God,  Our Help"
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