package com.kuntito.abundantlifehymnbook.ui

import android.view.View
import androidx.viewpager2.widget.ViewPager2
import kotlin.math.abs

private const val MIN_SCALE = 0.85f
private const val MIN_ALPHA = 0.5f
object CustomPageTransformer: ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {
//        val absPos = abs(position)
        page.apply {
//            translationY = 50f * absPos
            val scaleFactor = MIN_SCALE.coerceAtLeast(1 - abs(position))

            if (position < -1 || position > 1) alpha = 0f

            alpha = when {
                position < -1 -> { // [-Infinity,-1)
                    // This page is way off-screen to the left.
                    0f
                }
                position <= 1 -> { // [-1,1]
                    // Fade the page relative to its size.
                    (MIN_ALPHA +
                            (((scaleFactor - MIN_SCALE) / (1 - MIN_SCALE)) * (1 - MIN_ALPHA)))

                }
                else -> { // (1,+Infinity]
                    // This page is way off-screen to the right.
                    0f
                }
            }
        }
    }
}