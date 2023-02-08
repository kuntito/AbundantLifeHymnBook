package com.kuntito.abundantlifehymnbook.util

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.Lyrics
import com.kuntito.abundantlifehymnbook.ui.theme.White_50_percent

fun showSoftKeyboard(activity: AppCompatActivity){
    val inputManager: InputMethodManager = activity
        .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

    //check if no view has focus:
    val v: View = activity.currentFocus ?: return

//    inputManager.hideSoftInputFromWindow(v.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
    inputManager.showSoftInput(v, InputMethodManager.SHOW_FORCED)
}

fun getSampleHymn(id: Int, longTitle: Boolean = false): Hymn {
    val title = "HymnTitle"
    return  object: Hymn(){
        override val id = id
        override val title = if (longTitle) "Hymn Title Occupying Two Lines" else title
        override val lyrics = Lyrics(
            hymnTitle = title,
            verses = listOf(
                HymnVerse(1, "Look\n" +
                        "Self-awareness, pride's a coat, and yes, I like to wear it\n" +
                        "Buttoned up, don't like to let no air in\n" +
                        "With a pair of gloves that I hope doesn't perish\n" +
                        "I discovered, though, when I get holes in them\n" +
                        "And I let joy in, I'm in higher spirits\n" +
                        "My mistakes are like a screamin' parrot\n" +
                        "Just repeating lyrics, I can barely bear it when I'm lost"),

                HymnVerse(2, "Road is narrow, I'm lookin' down it like a gun's barrel\n" +
                        "Aren't we all searchin' for the serum\n" +
                        "That could help us breathe and leave our state of peril?\n" +
                        "All of us have made defensive scarecrows\n" +
                        "That we scatter 'round our fields and treat like heroes\n" +
                        "When they scare away the things that we should cherish\n" +
                        "'Cause we're too embarrassed to admit the fear is that we're lost"),

                HymnVerse(3, "Yeah, but what does it matter? I get so combative\n" +
                        "Inside of me's a personal canvas, the paint can be splattered\n" +
                        "Get messy when I start to get rattled\n" +
                        "The heart of a savage, I'm quiet when I lurk in the shadows\n" +
                        "But somethin' don't add up, I don't wanna be overdramatic"),
            ),
            chorus = "When I'm lost\n" +
                    "When I'm lost (lost)\n" +
                    "When I'm lost\n" +
                    "When I'm lost (lost), lost"
        )
    }
}

fun queryInTitle(query: String, hymnTitle: String): Boolean{
    return query.lowercase() in hymnTitle.lowercase()
}

fun queryInLyrics(query: String, hymnLyrics: Lyrics): Boolean{
    for(hymnVerse in hymnLyrics.lyrics){
        for(line in hymnVerse.lines.split("\n")){
            if(query.lowercase() in line.lowercase()){
                return true
            }
        }
    }
    return false
}

fun Modifier.simpleVerticalScrollbar(
    state: LazyListState,
    width: Dp = 8.dp
): Modifier = composed {
    val targetAlpha = if (state.isScrollInProgress) 1f else 0f
    val duration = if (state.isScrollInProgress) 150 else 500

    val alpha by animateFloatAsState(
        targetValue = targetAlpha,
        animationSpec = tween(durationMillis = duration)
    )

    drawWithContent {
        drawContent()

        val firstVisibleElementIndex = state.layoutInfo.visibleItemsInfo.firstOrNull()?.index
        val needDrawScrollbar = state.isScrollInProgress || alpha > 0.0f

        // Draw scrollbar if scrolling or if the animation is still running and lazy column has content
        if (needDrawScrollbar && firstVisibleElementIndex != null) {
            val elementHeight = this.size.height / state.layoutInfo.totalItemsCount
            val scrollbarOffsetY = firstVisibleElementIndex * elementHeight
            val scrollbarHeight = state.layoutInfo.visibleItemsInfo.size * elementHeight

            drawRect(
                color = White_50_percent,
                topLeft = Offset(this.size.width - width.toPx(), scrollbarOffsetY),
                size = Size(width.toPx(), scrollbarHeight),
                alpha = alpha
            )
        }
    }
}
