package com.kuntito.abundantlifehymnbook.ui.composables

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.kuntito.abundantlifehymnbook.R
import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.SearchDisplay
import com.kuntito.abundantlifehymnbook.data.models.viewmodel.HymnBookViewModel
import com.kuntito.abundantlifehymnbook.ui.theme.AbundantLifeHymnBookTheme
import com.kuntito.abundantlifehymnbook.ui.theme.DarkBlue400
import com.kuntito.abundantlifehymnbook.ui.theme.Grey800
import com.kuntito.abundantlifehymnbook.ui.theme.White_50_percent
import com.kuntito.abundantlifehymnbook.util.getSampleHymn
import com.kuntito.abundantlifehymnbook.util.simpleVerticalScrollbar
import kotlinx.coroutines.launch


@Composable
fun HymnListSearchScreen(viewModel: HymnBookViewModel, navController: NavController) {
    val hymnTitles = viewModel.hymns.map{it.title}
    val searchBarState = viewModel.searchBarState
    val hymnListState = viewModel.hymnListState
    val onClickHymnTitle = {hymnTitle: String ->
        viewModel.setCurrentHymn(hymnTitle)
        navController.navigate(R.id.action_hymnListFragment_to_hymnLyricsFragment)
    }
    val onSearchResultClick = {hymnTitle: String ->
        onClickHymnTitle(hymnTitle)
        viewModel.setIsNavFromHymnSearch(true)
    }
    val onRemoveSearchItem = {hymnTitle: String ->
        searchBarState.removeRecentSearch(hymnTitle)
    }
    val onClearHistory = {
        searchBarState.clearRecentSearches()
    }
    val searchHymnBookQuery = viewModel::searchHymnBookQuery
    Box{
        Image(
            painter = painterResource(id = R.drawable.app_bg),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
        HymnListSearchScreenContent(
            hymnTitles = hymnTitles,
            searchBarState = searchBarState,
            hymnListState = hymnListState,
            onClickHymnTitle = onClickHymnTitle,
            onSearchResultClick = onSearchResultClick,
            onRemoveSearchItem = onRemoveSearchItem,
            onClearHistory = onClearHistory,
            searchHymnBookQuery = searchHymnBookQuery
        )
    }
}

@Composable
fun HymnListSearchScreenContent(
    modifier: Modifier = Modifier,
    hymnTitles: List<String>,
    searchBarState: SearchState,
    hymnListState: LazyListState,
    onClickHymnTitle: (String) -> Unit,
    onSearchResultClick: (String) -> Unit,
    onRemoveSearchItem: (String) -> Unit,
    onClearHistory: () -> Unit,
    searchHymnBookQuery: (String) -> List<Hymn>
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        LogoAndSearchBar(
            modifier = Modifier.padding(16.dp),
            searchBarState = searchBarState
        )
        AnimatedVisibility(visible = !searchBarState.focused) {
            Box{
                LazyColumnShape{
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .simpleVerticalScrollbar(
                                state = hymnListState
                            )
                            .padding(horizontal = 16.dp),
                        state = hymnListState,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        item { Spacer(modifier = Modifier.height(16.dp)) }
                        item { HymnListHeader() }
                        item { Spacer(modifier = Modifier.height(32.dp)) }
                        items(count = hymnTitles.size){ index ->
                            val hymnTitle = hymnTitles[index]
                            HymnTitleRow(
                                hymnNumber = index+1,
                                hymnTitle = hymnTitle,
                                onClickHymnTitle = onClickHymnTitle
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                        }
                        item { Spacer(modifier = Modifier.height(20.dp)) }
                    }
                }
//                ScrollToTopFab(
//                    listState = hymnListState,
//                    modifier = Modifier
//                        .align(Alignment.BottomEnd)
//                        .padding(bottom = 16.dp, end = 16.dp)
//                )
            }
        }
        LaunchedEffect(key1 = searchBarState.query.text){
            searchBarState.query.text.let{
                if (it.isNotEmpty()){
                    searchBarState.searching = true
                    searchBarState.searchResults = searchHymnBookQuery(it)
                }
            }
            searchBarState.searching = false
        }
        //SearchResults
        AnimatedVisibility(visible = searchBarState.focused) {
            SearchDisplayDropdown(
                searchBarState = searchBarState,
                onSearchResultClick = onSearchResultClick,
                onClickHymnTitle = onClickHymnTitle,
                onRemoveSearchItem = onRemoveSearchItem,
                onClearHistory = onClearHistory
            )
        }

    }
}


@Composable
fun SearchDisplayDropdown(
    modifier: Modifier = Modifier,
    searchBarState: SearchState,
    onSearchResultClick: (String) -> Unit,
    onClickHymnTitle: (String) -> Unit,
    onRemoveSearchItem: (String) -> Unit,
    onClearHistory: () -> Unit
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        AnimatedVisibility(visible = searchBarState.searching) {
            CircularProgressIndicator(
                modifier = Modifier
                    .size(24.dp),
                color = Grey800,
                strokeWidth = 2.dp
            )
        }
        AnimatedVisibility(visible = !searchBarState.searching) {
            when(searchBarState.searchDisplay){
                SearchDisplay.NoResults -> {
                    Text(
                        text = "No result found",
                        style = MaterialTheme.typography.body2,
                        modifier = Modifier.padding(bottom = 52.dp)
                    )
                }
                SearchDisplay.Results -> {
                    Column{
                        Text(
                            text = stringResource(R.string.search_result),
                            style = MaterialTheme.typography.h1,
                            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 4.dp)
                        )
                        val searchResultsState = rememberLazyListState()
                        LazyColumnShape{
                            LazyColumn(
                                state = searchResultsState,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .simpleVerticalScrollbar(searchResultsState)
                                    .padding(horizontal = 16.dp)
                                    .animateContentSize()
                            ){
                                items(count = searchBarState.searchResults.size){index ->
                                    val hymn = searchBarState.searchResults[index]
                                    SearchResultItem(
                                        hymn = hymn,
                                        onSearchResultClick = onSearchResultClick
                                    )
                                }
                            }
                        }
                    }
                }
                SearchDisplay.SearchHistory -> {
                    Column(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                    ){
                        AnimatedVisibility(visible = searchBarState.recentSearches.isNotEmpty()) {
                            SearchHistoryHeader(
                                recentSearches = searchBarState.recentSearches,
                                onClearHistory = onClearHistory
                            )
                        }
                        val recentSearchesState = rememberLazyListState()
                        LazyColumnShape{
                            LazyColumn(
                                state = recentSearchesState,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .animateContentSize()
                                    .simpleVerticalScrollbar(recentSearchesState)
                                    .padding(vertical = 8.dp)
                            ) {
                                items(count = searchBarState.recentSearches.size) { index ->
                                    val hymnSearched = searchBarState.recentSearches[index]
                                    RecentSearchItem(
                                        hymnSearched = hymnSearched,
                                        onClickHymnTitle = onClickHymnTitle,
                                        onRemoveSearchItem = onRemoveSearchItem
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SearchHistoryHeader(
    modifier: Modifier = Modifier,
    recentSearches: List<String>,
    onClearHistory: () -> Unit
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = stringResource(R.string.recent_searches),
            style = MaterialTheme.typography.h1.copy(textAlign = TextAlign.Start),
            modifier = Modifier
                .padding(bottom = 4.dp)
                .weight(1f)
        )
        Text(
            text = "Clear",
            color = Grey800,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .clickable (enabled = recentSearches.isNotEmpty()){
                    onClearHistory()
                }
        )
    }
}

@Composable
fun LazyColumnShape(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Surface(
        color = Color.Transparent,
        shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
        content = content,
        modifier = modifier
    )
}

@Composable
fun RecentSearchItem(
    modifier: Modifier = Modifier,
    hymnSearched: String,
    onClickHymnTitle: (String) -> Unit,
    onRemoveSearchItem: (String) -> Unit
) {
    Column(
        modifier = modifier
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = hymnSearched,
                style = MaterialTheme.typography.body2.copy(
                    textAlign = TextAlign.Start
                ),
                modifier = Modifier
                    .weight(1f)
                    .clickable { onClickHymnTitle(hymnSearched) },
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            IconButton(
                onClick = { onRemoveSearchItem(hymnSearched) }
            ){
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = null,
                    tint = White_50_percent
                )
            }
        }
        DividerItem()
    }
}

@Composable
fun SearchResultItem(
    hymn: Hymn,
    onSearchResultClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .clickable { onSearchResultClick(hymn.title) }
    ){
        Spacer(modifier = Modifier.height(12.dp))
        Row {
            Text(
                text = "${hymn.id}.",
                maxLines = 1,
                style = MaterialTheme.typography.body2
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = hymn.title,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.body2
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        DividerItem()
    }
}

@Composable
fun DividerItem() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = White_50_percent)
    )
}

@Composable
fun HymnListHeader() {
    Text(
        text = stringResource(id = R.string.hymn_list_header),
        letterSpacing = 2.sp,
        style = MaterialTheme.typography.h1
    )
}

@Composable
fun HymnTitleRow(
    modifier: Modifier = Modifier,
    hymnNumber: Int,
    hymnTitle: String,
    onClickHymnTitle: (String) -> Unit
) {
    val surfaceShape = RoundedCornerShape(20.dp)
    Box(modifier = modifier){
        ShadowBox(elevation = 10.dp, shape = surfaceShape) {
            Surface(
                modifier = Modifier
                    .clickable { onClickHymnTitle(hymnTitle) }
                    .height(60.dp)
                    .fillMaxWidth(),
                shape = surfaceShape,
                color = White_50_percent
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                ){
                    Surface(
                        shape = CircleShape,
                        modifier = Modifier.size(30.dp),
                        color = DarkBlue400
                    ){
                        Box(contentAlignment = Alignment.Center){
                            Text(
                                text = hymnNumber.toString(),
                                color = Color.White,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = hymnTitle,
                        color = Color.White,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

@Composable
fun LogoAndSearchBar(
    modifier: Modifier = Modifier,
    searchBarState: SearchState
) {
    val rowHeight = 50
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .height(rowHeight.dp)
    ){
        AnimatedVisibility(visible = !searchBarState.focused) {
            Icon(
                painter = painterResource(id = R.drawable.ic_algc),
                contentDescription = null,
                modifier = Modifier
                    .size(rowHeight.dp)
                    .shadow(elevation = 10.dp, shape = CircleShape),
                tint = Color.Unspecified
            )
        }
        SearchBar(
            query = searchBarState.query,
            focused = searchBarState.focused,
            searching = searchBarState.searching,
            focusRequester = searchBarState.focusRequester,
            onFocusChanged = { searchBarState.focused = it },
            onQueryChange = {searchBarState.changeQuery(it)},
            onClearQuery = {searchBarState.changeQuery(TextFieldValue(""))},
            fontSize = 14,
            modifier = Modifier.padding(start = if(!searchBarState.focused) 16.dp else 0.dp)
        )
    }
}


@Preview
@Composable
fun SearchHistoryItemPreview() {
    AbundantLifeHymnBookTheme {
        RecentSearchItem(
            hymnSearched = "Above All Power",
            onClickHymnTitle = {},
            onRemoveSearchItem = {}
        )
    }
}

@Preview
@Composable
fun SearchResultItemPreview() {
    AbundantLifeHymnBookTheme {
        val hymn = getSampleHymn(1)

        SearchResultItem(
            hymn = hymn,
            onSearchResultClick = {}
        )
    }
}

@Preview
@Composable
fun HymnTitleRowPreview() {
    Column{
        HymnTitleRow(
            hymnNumber = 12,
            hymnTitle = stringResource(id = R.string.long_hymn_title),
            onClickHymnTitle = {}
        )
        Spacer(modifier = Modifier.height(16.dp))
        HymnTitleRow(
            hymnNumber = 12,
            hymnTitle = stringResource(id = R.string.hymn_title),
            onClickHymnTitle = {}
        )
    }
}

@Preview(backgroundColor = 0xFF131436)
@Composable
fun HymnListSearchScreenPreview() {
    val hymnTitles = List(50){
        "Hymn Title"
    }
    val state = rememberSearchState()
    AbundantLifeHymnBookTheme {
        HymnListSearchScreenContent(
            hymnTitles = hymnTitles,
            searchBarState = state,
            onClickHymnTitle = {},
            onSearchResultClick = {},
            searchHymnBookQuery = { listOf()},
            onRemoveSearchItem = {},
            onClearHistory = {},
            hymnListState = LazyListState()
        )
    }
}
