package com.kuntito.abundantlifehymnbook.ui.composables

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuntito.abundantlifehymnbook.R
import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.ui.theme.Grey800
import com.kuntito.abundantlifehymnbook.ui.theme.White_50_percent

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    query: TextFieldValue,
    focused: Boolean,
    searching: Boolean,
    focusRequester: FocusRequester,
    onFocusChanged: (Boolean) -> Unit,
    onQueryChange: (TextFieldValue) -> Unit,
    onClearQuery: () -> Unit,
    fontSize: Int
) {
//    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current
    val shape = RoundedCornerShape(20.dp)

    ShadowBox(
        elevation = 10.dp,
        shape = shape,
        modifier = modifier
            .height(36.dp)
            .fillMaxWidth()
    ) {
        Surface(
            shape = shape,
            color = White_50_percent
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = if(focused) 0.dp else 4.dp, end = 8.dp)
            ){
                AnimatedVisibility(visible = focused) {
                    IconButton(
                        onClick = {
                            focusManager.clearFocus()
                            onClearQuery()
                        },
                        modifier = Modifier.padding(start = 8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = null,
                            tint = Grey800
                        )
                    }
                }
                SearchTextField(
                    query = query,
                    focused = focused,
                    focusRequester = focusRequester,
                    fontSize = fontSize,
                    onQueryChange = onQueryChange,
                    onFocusChanged = onFocusChanged,
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .weight(1f)
                )

                AnimatedVisibility(visible = query.text.isNotEmpty()) {
                    IconButton(onClick = onClearQuery) {
                        Icon(
                            imageVector = Icons.Filled.Close,
                            contentDescription = null,
                            tint = Grey800
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun SearchTextField(
    modifier: Modifier = Modifier,
    query: TextFieldValue,
    focused: Boolean,
    focusRequester: FocusRequester,
    fontSize: Int,
    onQueryChange: (TextFieldValue) -> Unit,
    onFocusChanged: (Boolean) -> Unit
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.CenterStart
    ){
        if (query.text.isEmpty()){
            SearchHint(focused = focused, fontSize = fontSize)
        }
        BasicTextField(
            value = query,
            onValueChange = onQueryChange,
            singleLine = true,
            textStyle = TextStyle(
                color = Color.White,
                fontSize = fontSize.sp
            ),
            cursorBrush = SolidColor(Color.White),
            modifier = Modifier
                .fillMaxWidth()
                .onFocusChanged {
                    onFocusChanged(it.isFocused)
                }
                .focusRequester(focusRequester)
        )
    }

}

@Composable
private fun SearchHint(
    modifier: Modifier = Modifier,
    focused: Boolean,
    fontSize: Int
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxSize()
    ) {
        AnimatedVisibility(visible = !focused) {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = null,
                tint = Grey800
            )
        }
        Text(
            color = Grey800,
            text = stringResource(id = R.string.search_hint),
            modifier = Modifier.padding(start = if (!focused) 4.dp else 0.dp),
            fontSize = fontSize.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}


@Composable
fun rememberSearchState(
    query: TextFieldValue = TextFieldValue(""),
    focused: Boolean = false,
    searching: Boolean = false,
    searchResults: List<Hymn> = emptyList()
): SearchState {
    return remember {
        SearchState(
            query = query,
            focused = focused,
            searching = searching,
            searchResults = searchResults
        )
    }
}

@Preview(widthDp = 360, heightDp = 640, showBackground = true)
@Composable
fun SearchBarPreview() {
    val state = rememberSearchState()
    SearchBar(
        query = state.query,
        focused = state.focused,
        searching = false,
        focusRequester = state.focusRequester,
        onFocusChanged = {state.focused = it},
        onQueryChange = {state.changeQuery(it)},
        onClearQuery = {state.changeQuery(TextFieldValue(""))},
        fontSize = 14
    )
}