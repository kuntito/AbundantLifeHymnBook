package com.kuntito.abundantlifehymnbook.ui.adapter

import android.graphics.Typeface
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.kuntito.abundantlifehymnbook.R
import com.kuntito.abundantlifehymnbook.data.models.HymnVerse
import com.kuntito.abundantlifehymnbook.data.models.HymnVerseType
import com.kuntito.abundantlifehymnbook.databinding.HymnVerseItemBinding


class HymnVerseAdapter (
    private var hymnVerses: List<HymnVerse>,
): RecyclerView.Adapter<HymnVerseAdapter.HymnVerseViewHolder>() {

    inner class HymnVerseViewHolder(val binding: HymnVerseItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HymnVerseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = HymnVerseItemBinding.inflate(inflater, parent, false)
        return HymnVerseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HymnVerseViewHolder, position: Int) {
        val verse = hymnVerses[position]
        holder.binding.apply {
            tvVerseId.setTextAppearance(
                when(verse.type){
                    HymnVerseType.Verse -> R.style.verse_id_style
                    HymnVerseType.Chorus -> R.style.chorus_id_style
                }
            )
            tvVerseId.text = verse.stringId
            tvVerseLyrics.text = verse.lines
        }
    }

    override fun getItemCount(): Int {
        return hymnVerses.size
    }
}