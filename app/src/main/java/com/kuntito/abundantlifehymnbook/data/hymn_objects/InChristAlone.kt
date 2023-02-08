package com.kuntito.abundantlifehymnbook.data.hymn_objects

import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics

object InChristAlone: Hymn() {
    private val verse1 = HymnVerse(
        1,
        "In Christ alone my hope is found\n" +
                "He is my light, my strength, my song\n" +
                "This cornerstone, this solid ground\n" +
                "Firm through the fiercest drought and storm\n" +
                "What heights of love, what depths of peace\n" +
                "When fears are stilled, when strivings cease!\n" +
                "My Comforter, my All in All,\n" +
                "Here in the love of Christ I stand"
    )
	private val verse2 = HymnVerse(
        2,
        "In Christ alone! - who took on flesh\n" +
                "Fullness of God in helpless babe\n" +
                "This gift of love and righteousness\n" +
                "Scorned by the ones he came to save\n" +
                "Till on that cross as Jesus died\n" +
                "The wrath of God was satisfied\n" +
                "For every sin on him was laid\n" +
                "Here in the death of Christ I live"
    )
	private val verse3 = HymnVerse(
        3,
        "There in the ground his body lay\n" +
                "Light of the world by darkness slain\n" +
                "Then bursting forth in glorious day\n" +
                "Up from the grave he rose again\n" +
                "And as he stands in victory\n" +
                "Sin's curse has lost its grip on me\n" +
                "For I am his and he is mine\n" +
                "Bought with the precious blood of Christ"
    )
	private val verse4 = HymnVerse(
        4,
        "No guilt in life, no fear in death\n" +
                "This is the power of Christ in me\n" +
                "From life's first cry to final breath\n" +
                "Jesus commands my destiny\n" +
                "No power of hell, no scheme of man\n" +
                "Can ever pluck me from his hand\n" +
                "Till he returns or calls me home\n" +
                "Here in the power of Christ I'll stand"
    )
	
    override val id: Int = 36
    override val title = "In Christ Alone"
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