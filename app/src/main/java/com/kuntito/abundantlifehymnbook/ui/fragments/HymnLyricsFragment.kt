package com.kuntito.abundantlifehymnbook.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.text.input.TextFieldValue
import androidx.core.text.HtmlCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.tabs.TabLayoutMediator
import com.kuntito.abundantlifehymnbook.data.models.Hymn
import com.kuntito.abundantlifehymnbook.data.models.HymnVerseType
import com.kuntito.abundantlifehymnbook.data.models.viewmodel.HymnBookViewModel
import com.kuntito.abundantlifehymnbook.databinding.FragmentHymnLyricsBinding
import com.kuntito.abundantlifehymnbook.ui.CustomPageTransformer
import com.kuntito.abundantlifehymnbook.ui.adapter.HymnVerseAdapter


class HymnLyricsFragment: Fragment() {
    private lateinit var hymn: Hymn
    private val hymnBookViewModel: HymnBookViewModel by activityViewModels()
    private var _binding: FragmentHymnLyricsBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHymnLyricsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hymn = hymnBookViewModel.currentHymn.value!!
        val verses = hymn.lyrics.lyricsChorusAfterEachVerse

        binding.apply {
            tvHymnTitle.text = hymn.title
            ibBackButton.setOnClickListener {
                findNavController().navigateUp()
            }
            pagerHymnVerse.adapter = HymnVerseAdapter(verses)
            pagerHymnVerse.setPageTransformer(CustomPageTransformer)

            TabLayoutMediator(tlHymnVerse, pagerHymnVerse) { tab, position ->
                val verse = verses[position]
                tab.text = when(verse.type){
                    HymnVerseType.Chorus -> {
                        HtmlCompat.fromHtml(
                            "<font color=#f72585>${verse.stringId[0]}</font>",
                            HtmlCompat.FROM_HTML_MODE_COMPACT
                        )
                    }
                    HymnVerseType.Verse -> {
                        verse.stringId
                    }
                }

            }.attach()

        }

    }

    override fun onStop() {
        super.onStop()
        hymnBookViewModel.let {
            if (it.isNavFromHymnSearch){
                it.onNavFromHymnSearch(hymn.title)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

