package com.kuntito.abundantlifehymnbook.ui.composables

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuntito.abundantlifehymnbook.R
import com.kuntito.abundantlifehymnbook.ui.fragments.TAG
import kotlinx.coroutines.launch

@Composable
fun ScrollToTopFab(
    listState: LazyListState,
    modifier: Modifier = Modifier
) {
    val isScrollingUp = listState.isScrollingUp()
    val isScrollingDown = listState.isScrollingDown()

//    val iconDrawable =
    if(isScrollingUp || isScrollingDown){
        val coroutineScope = rememberCoroutineScope()
        FloatingActionButton(
            backgroundColor = MaterialTheme.colors.background,
            modifier = modifier,
            onClick = {
                coroutineScope.launch {
                    if (isScrollingUp){
                        listState.scrollToItem(0)
                    }
                    if (isScrollingDown){
                        listState.scrollToItem(listState.layoutInfo.totalItemsCount-1)
                    }
                }
            }
        ) {
            Icon(
                painter = painterResource(
                    id = if (isScrollingUp) {
                            R.drawable.ic_arrow_up
                        } else {
                            R.drawable.ic_arrow_down
                        }),
                contentDescription = null,
                tint = Color.White
            )
        }
    }
}

@Composable
private fun LazyListState.isScrollingUp(): Boolean {
    var previousIndex by remember(this) { mutableStateOf(firstVisibleItemIndex) }
    var previousScrollOffset by remember(this) { mutableStateOf(firstVisibleItemScrollOffset) }
    return remember(this) {
        derivedStateOf {
            if (firstVisibleItemIndex == 0){
                false
            } else if(previousIndex != firstVisibleItemIndex){
//                Log.d(TAG, "previousIndex=$previousIndex")
//                Log.d(TAG, "firstVisibleItemIndex=$firstVisibleItemIndex")
                previousIndex > firstVisibleItemIndex
            }else{
                previousScrollOffset >= firstVisibleItemScrollOffset
            }.also {
                previousIndex = firstVisibleItemIndex
                previousScrollOffset = firstVisibleItemScrollOffset
            }
        }
    }.value
}

@Composable
private fun LazyListState.isScrollingDown(): Boolean {
    var previousIndex by remember(this) { mutableStateOf(firstVisibleItemIndex) }
    var previousScrollOffset by remember(this) { mutableStateOf(firstVisibleItemScrollOffset) }
    return remember(this) {
        derivedStateOf {
            if( isScrolledToTheEnd() || firstVisibleItemIndex == 0){
                Log.d(TAG, "condition=false")
               false
            }else if (previousIndex != firstVisibleItemIndex) {
                Log.d(TAG, "previousIndex=$previousIndex")
                Log.d(TAG, "firstVisibleItemIndex=$firstVisibleItemIndex")
                Log.d(TAG, "prevIndex < firstVisibleItemIndex" +
                        "=${previousIndex < firstVisibleItemIndex}")
                previousIndex < firstVisibleItemIndex
            }else {
                Log.d(TAG, "prevScrollOffset < firstVisibleItemScrollOffset" +
                        "=${previousScrollOffset <= firstVisibleItemScrollOffset}")
                previousScrollOffset <= firstVisibleItemScrollOffset
            }.also {
                previousIndex = firstVisibleItemIndex
                previousScrollOffset = firstVisibleItemScrollOffset
            }
        }
    }.value
}

fun LazyListState.isScrolledToTheEnd() =
    layoutInfo.visibleItemsInfo.lastOrNull()?.index == layoutInfo.totalItemsCount - 1