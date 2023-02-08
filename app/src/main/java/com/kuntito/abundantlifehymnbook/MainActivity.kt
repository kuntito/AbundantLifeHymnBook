package com.kuntito.abundantlifehymnbook

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.text.input.TextFieldValue
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.kuntito.abundantlifehymnbook.databinding.ActivityMainBinding
import com.kuntito.abundantlifehymnbook.data.models.viewmodel.HymnBookViewModel
import com.kuntito.abundantlifehymnbook.ui.fragments.TAG
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


const val pref_name = "pref"
const val recentSearchesKey = "recentSearchesKey"
const val separator = "%"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val hymnBookViewModel: HymnBookViewModel by viewModels()
    private lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPref = getSharedPreferences(pref_name, Context.MODE_PRIVATE)
        sharedPref.getString(recentSearchesKey, null)?.let{
            hymnBookViewModel.searchBarState.initializeRecentSearches(
                if (it.isEmpty()) emptyList() else it.split(separator)
            )
        }
    }

    override fun onBackPressed() {
        hymnBookViewModel.searchBarState.also {
            when(it.focused){
                true -> {
                    binding.fragmentContainerView.clearFocus()
                    hymnBookViewModel.searchBarState.changeQuery(TextFieldValue(""))
                }
                false -> {
                    super.onBackPressed()
                }
            }
        }
    }

    override fun onStop() {
        super.onStop()
        hymnBookViewModel.searchBarState.recentSearches.let{
            if(it.isNotEmpty()){
                /**Psv - Percent separated values*/
                val searchQueriesPsv = it.joinToString (separator)
                // saving search queries
                sharedPref.edit().putString(
                    recentSearchesKey,
                    searchQueriesPsv
                ).apply()
            }
        }
    }
}