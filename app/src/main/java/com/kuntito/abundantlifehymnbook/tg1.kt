package com.kuntito.abundantlifehymnbook

//import androidx.compose.animation.AnimatedVisibility
//import androidx.compose.animation.ExperimentalAnimationApi
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material.icons.filled.Close
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.CompositionLocalProvider
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.ExperimentalComposeUiApi
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.focus.FocusRequester
//import androidx.compose.ui.focus.focusRequester
//import androidx.compose.ui.focus.onFocusChanged
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalFocusManager
//import androidx.compose.ui.platform.LocalSoftwareKeyboardController
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.kuntito.abundantlifehymnbook.data.models.SearchState
//import com.kuntito.abundantlifehymnbook.ui.theme.Grey800
//import com.kuntito.abundantlifehymnbook.ui.theme.White_40_percent
//
//@ExperimentalAnimationApi
//@OptIn(ExperimentalComposeUiApi::class)
//@Composable
//fun SearchBar(
//    query: TextFieldValue,
//    onQueryChange: (TextFieldValue) -> Unit,
//    onSearchFocusChange: (Boolean) -> Unit,
//    onClearQuery: () -> Unit,
//    onBack: ()-> Unit,
//    searching: Boolean,
//    focused: Boolean,
//    modifier: Modifier = Modifier
//) {
//
//    val focusManager = LocalFocusManager.current
//    val keyboardController = LocalSoftwareKeyboardController.current
//
//    Row(
//        modifier = modifier.fillMaxWidth(),
//        verticalAlignment = Alignment.CenterVertically
//    ) {
////        Box(modifier = Modifier.size(36.dp).background(color = Color.Green))
//        AnimatedVisibility(visible = focused) {
//            // Back button
//            IconButton(
//                modifier = Modifier.padding(start =2.dp),
//                onClick = {
//                    focusManager.clearFocus()
//                    keyboardController?.hide()
//                    onBack()
//                }) {
//                Icon(
//                    imageVector = Icons.Default.ArrowBack,
//                    contentDescription = null,
//                    tint = Color.White
//                )
//            }
//        }
//
//        SearchTextField(
//            query,
//            onQueryChange,
//            onSearchFocusChange,
//            onClearQuery,
//            searching,
//            focused,
//            modifier
//                .fillMaxHeight()
//                .weight(1f)
//        )
//    }
//}
//
///**
// * This is a stateless TextField for searching with a Hint when query is empty,
// * and clear and loading [IconButton]s to clear query or show progress indicator when
// * a query is in progress.
// */
//@Composable
//fun SearchTextField(
//    query: TextFieldValue,
//    onQueryChange: (TextFieldValue) -> Unit,
//    onSearchFocusChange: (Boolean) -> Unit,
//    onClearQuery: () -> Unit,
//    searching: Boolean,
//    focused: Boolean,
//    modifier: Modifier = Modifier
//) {
//
//    val focusRequester = remember { FocusRequester() }
//
//    Surface(
//        modifier = modifier
//            .then(
//                Modifier
//                    .padding(
//                        start = if (!focused) 16.dp else 0.dp
//                    )
//            ),
//        color = White_40_percent,
//        shape = RoundedCornerShape(percent = 50),
//    ) {
//
//        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
//            Box(
//                contentAlignment = Alignment.CenterStart,
//                modifier = modifier
//            ) {
//
//                if (query.text.isEmpty()) {
//                    SearchHint(
//                        modifier.padding(start = 8.dp),
//                        focused = focused
//                    )
//                }
//
//                Row(verticalAlignment = Alignment.CenterVertically) {
//                    BasicTextField(
//                        value = query,
//                        onValueChange = onQueryChange,
//                        modifier = Modifier
//                            .fillMaxHeight()
//                            .weight(1f)
//                            .onFocusChanged {
//                                onSearchFocusChange(it.isFocused)
//                            }
//                            .focusRequester(focusRequester)
//                            .padding(top = 9.dp, bottom = 8.dp, start = 16.dp, end = 8.dp),
//                        singleLine = true
//                    )
//
//                    when {
//                        searching -> {
//                            CircularProgressIndicator(
//                                modifier = Modifier
//                                    .padding(horizontal = 6.dp)
//                                    .size(36.dp)
//                            )
//                        }
//                        query.text.isNotEmpty() -> {
//                            IconButton(onClick = onClearQuery) {
//                                Icon(
//                                    imageVector = Icons.Filled.Close,
//                                    contentDescription = null,
//                                    tint = Color.White
//                                )
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
//
//@Composable
//private fun SearchHint(modifier: Modifier = Modifier, focused: Boolean) {
//    Row(
//        verticalAlignment = Alignment.CenterVertically,
//        modifier = Modifier
//            .fillMaxSize()
//            .then(modifier)
//
//    ) {
//        AnimatedVisibility(visible = !focused) {
//            Icon(
//                imageVector = Icons.Filled.Search,
//                contentDescription = null,
//                tint = Grey800
//            )
//        }
//        Text(
//            color = Grey800,
//            text = stringResource(id = R.string.search_hint),
//            modifier = Modifier.padding(start = if (focused) 16.dp else 8.dp),
//            fontSize = 17.sp
//        )
//    }
//}
//
//@Composable
//fun rememberSearchState(
//    query: TextFieldValue = TextFieldValue(""),
//    focused: Boolean = false,
//    searching: Boolean = false,
//    suggestions: List<String> = emptyList(),
//    searchResults: List<String> = emptyList()
//): SearchState {
//    return remember {
//        SearchState(
//            query = query,
//            focused = focused,
//            searching = searching,
//            suggestions = suggestions,
//            searchResults = searchResults
//        )
//    }
//}
//@Preview
//@OptIn(ExperimentalAnimationApi::class)
//@Composable
//fun SearchBarPreview() {
//    val state = rememberSearchState()
//    SearchBar(
//        query = state.query,
//        onQueryChange = { state.query = it},
//        onSearchFocusChange = { state.focused = it },
//        onClearQuery = {state.query = TextFieldValue("") },
//        onBack = {state.query = TextFieldValue("") },
//        searching = state.searching,
//        focused = state.focused
//    )
//}