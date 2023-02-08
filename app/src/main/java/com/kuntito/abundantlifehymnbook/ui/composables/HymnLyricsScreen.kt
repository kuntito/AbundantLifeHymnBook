package com.kuntito.abundantlifehymnbook.ui.composables

//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontStyle
//import androidx.compose.ui.unit.sp
//import com.google.accompanist.pager.*
//import com.kuntito.abundantlifehymnbook.data.models.Hymn
//import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
//import com.kuntito.abundantlifehymnbook.data.models.HymnVerseType
//import com.kuntito.abundantlifehymnbook.data.models.viewmodel.HymnBookViewModel
//import com.kuntito.abundantlifehymnbook.ui.theme.AbundantLifeHymnBookTheme
//import com.kuntito.abundantlifehymnbook.util.getSampleHymn
//import kotlinx.coroutines.launch
//
//@Composable
//fun HymnLyricsScreen(viewModel: HymnBookViewModel) {
//    Surface(
//        color = MaterialTheme.colors.background
//    ){
//        HymnLyricsContent(
//            hymn = viewModel.hymns[0]
//        )
//    }
//}
//
//@Composable
//fun HymnLyricsContent(
//    hymn: Hymn
//) {
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
//    ){
//        BackButtonAndHymnTitle(hymn = hymn)
//        Spacer(modifier = Modifier.height(40.dp))
//        TabLayoutAndHymnVerses(
//            hymnVerses = hymn.lyrics.lyricsChorusAfterEachVerse
//        )
//    }
//}
//
//@Composable
//fun BackButtonAndHymnTitle(
//    modifier: Modifier = Modifier,
//    hymn: Hymn
//) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth(),
//        verticalAlignment = Alignment.Top
//    ){
//        val iconSize = 30
//        Icon(
//            imageVector = Icons.Filled.ArrowBack,
//            contentDescription = null,
//            tint = Color.White,
//            modifier = Modifier
//                .size(iconSize.dp)
//                .padding(top = 2.dp)
//                .clickable { }
//        )
//        HymnTitle(
//            hymnTitle = hymn.title,
//            modifier = Modifier
//                .padding(start = 4.dp, end = (iconSize + 4).dp)
//        )
//    }
//}
//
//
//@Composable
//fun HymnTitle(
//    modifier: Modifier = Modifier,
//    hymnTitle: String
//) {
//    Text(
//        modifier = modifier.fillMaxWidth(),
//        text = hymnTitle,
//        style = MaterialTheme.typography.h1
//    )
//}
//
//@OptIn(ExperimentalPagerApi::class)
//@Composable
//fun TabLayoutAndHymnVerses(
//    modifier: Modifier = Modifier,
//    hymnVerses: List<HymnVerse>
//) {
//    val pagerState = rememberPagerState()
//
//
//    Column(
//        modifier = modifier
//    ){
//        HymnVerseTabLayout(
//            hymnVerses = hymnVerses,
//            pagerState = pagerState
//        )
//        HorizontalPager(
//            modifier = Modifier
//                .fillMaxSize(),
//            count = hymnVerses.size,
//            state = pagerState
//        ){ index ->
//            HymnVerseIdAndLyrics(
//                hymnVerse = hymnVerses[index]
//            )
//        }
//    }
//}
//
//@OptIn(ExperimentalPagerApi::class)
//@Composable
//fun HymnVerseTabLayout(
//    modifier: Modifier = Modifier,
//    pagerState: PagerState,
//    hymnVerses: List<HymnVerse>
//) {
//    val scope = rememberCoroutineScope()
//
//
//    ScrollableTabRow(
//        selectedTabIndex = pagerState.currentPage,
//        indicator = { tabPositions ->
//            TabRowDefaults.Indicator(
//                modifier = Modifier.pagerTabIndicatorOffset(
//                    pagerState,
//                    tabPositions
//                )
//            )
//        },
//        backgroundColor = Color.Transparent,
//        modifier = modifier
//    ) {
//        hymnVerses.forEachIndexed { index, _ ->
//            val hymnVerse = hymnVerses[index]
//            Tab(
//                selected = pagerState.currentPage == index,
//                onClick = {
//                    scope.launch {
//                        pagerState.animateScrollToPage(index)
//                    }
//                },
//                modifier = Modifier.padding(0.dp)
//            ) {
//                Text(
//                    text = if (hymnVerse.type == HymnVerseType.Chorus)
//                        "${hymnVerse.stringId[0]}" else hymnVerse.stringId,
//                    style = hymnVerseTextStyle(hymnVerse = hymnVerse).copy(fontSize = 15.sp),
//                    modifier = Modifier
//                        .padding(vertical = 8.dp)
//                )
//            }
//        }
//    }
//
//}
//
//@Composable
//fun hymnVerseTextStyle(hymnVerse: HymnVerse): TextStyle{
//
//    val textStyle = MaterialTheme.typography.h1
//
//    return when(hymnVerse.type){
//        HymnVerseType.Verse -> {
//            textStyle.copy(
//                color = MaterialTheme.colors.primaryVariant
//            )
//        }
//        HymnVerseType.Chorus -> {
//            textStyle.copy(
//                fontStyle = FontStyle.Italic,
//                color = MaterialTheme.colors.secondary
//            )
//        }
//    }
//}
//
//@Composable
//fun HymnVerseIdAndLyrics(hymnVerse: HymnVerse) {
//
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally
//    ){
//        Text(
//            text = hymnVerse.stringId,
//            style = hymnVerseTextStyle(hymnVerse = hymnVerse)
//        )
//        Spacer(modifier = Modifier.height(40.dp))
//        Text(
//            text = hymnVerse.lines,
//            style = hymnVerseTextStyle(hymnVerse = hymnVerse).copy(color = Color.White)
//        )
//    }
//}
//
//@Preview
//@Composable
//fun HymnLyricsPreview() {
//    val hymn = getSampleHymn(1, longTitle = true)
//    AbundantLifeHymnBookTheme {
//        HymnLyricsContent(hymn)
//    }
//}
//
//@Preview
//@Composable
//fun HymnLyricsPreview2() {
//    val hymn = getSampleHymn(1)
//    AbundantLifeHymnBookTheme {
//        HymnLyricsContent(hymn)
//    }
//}
