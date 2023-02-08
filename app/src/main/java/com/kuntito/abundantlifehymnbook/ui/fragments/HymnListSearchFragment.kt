package com.kuntito.abundantlifehymnbook.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.fragment.findNavController
import com.kuntito.abundantlifehymnbook.ui.composables.HymnListSearchScreen
import com.kuntito.abundantlifehymnbook.ui.theme.AbundantLifeHymnBookTheme
import com.kuntito.abundantlifehymnbook.util.showSoftKeyboard
import kotlinx.coroutines.delay

private const val giveSearchFocus = "giveSearchFocus"
const val TAG = "HymnBook"
class HymnListFragment : BaseFragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.composeView.setContent {
            AbundantLifeHymnBookTheme {
                HymnListSearchScreen(
                    viewModel = hymnBookViewModel,
                    navController = findNavController()
                )
            }
            LaunchedEffect(key1 = Unit){
                savedInstanceState?.let{
                    if(it.getBoolean(giveSearchFocus)){
                        delay(100)
                        hymnBookViewModel.searchBarState.focusRequester.requestFocus()
                        showSoftKeyboard(activity as AppCompatActivity)
                    }
                }
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean(
            giveSearchFocus, hymnBookViewModel.searchBarState.focused
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "hymnList fragment destroyed")
    }
}
