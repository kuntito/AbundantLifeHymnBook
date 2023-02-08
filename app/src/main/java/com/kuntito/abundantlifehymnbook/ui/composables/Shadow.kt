package com.kuntito.abundantlifehymnbook.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.LocalMinimumTouchTargetEnforcement
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.kuntito.abundantlifehymnbook.ui.theme.White_50_percent


@Composable
fun ClippedShadow(elevation: Dp, shape: Shape, modifier: Modifier = Modifier) {
    Layout(
        modifier
            .drawWithCache {
                // Naive cache setup similar to foundation's Background.
                val path = Path()
                var lastSize: Size? = null

                fun updatePathIfNeeded() {
                    if (size != lastSize) {
                        path.reset()
                        path.addOutline(
                            shape.createOutline(size, layoutDirection, this)
                        )
                        lastSize = size
                    }
                }

                onDrawWithContent {
                    updatePathIfNeeded()
                    clipPath(path, ClipOp.Difference) {
                        this@onDrawWithContent.drawContent()
                    }
                }
            }
            .shadow(elevation, shape)
    ) { _, constraints ->
        layout(constraints.minWidth, constraints.minHeight) {}
    }
}


@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterialApi::class)
@Composable
fun ShadowBox(
    elevation: Dp,
    shape: Shape,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Layout(
        {
            ClippedShadow(elevation, shape, modifier)
            CompositionLocalProvider(LocalMinimumTouchTargetEnforcement provides false) {
                content()
            }
        },
        modifier
    ) { measurables, constraints ->
        require(measurables.size == 2)

        val shadow = measurables[0]
        val target = measurables[1]

        val targetPlaceable = target.measure(constraints)
        val width = targetPlaceable.width
        val height = targetPlaceable.height

        val shadowPlaceable = shadow.measure(Constraints.fixed(width, height))

        layout(width, height) {
            shadowPlaceable.place(0, 0)
            targetPlaceable.place(0, 0)
        }
    }
}

@Preview
@Composable
fun Preview() {
    val color = Color.Blue.copy(0.5f)
    val shape = RoundedCornerShape(20.dp)
    val elevation = 10.dp
    val width = 200
    val height = 60
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .requiredSize((width*1.5).dp)
            .background(color = Color(0xFFAFB1FD))
    ){
        ShadowBox(elevation = elevation, shape = shape) {
            Surface(
                modifier = Modifier
                    .requiredWidth(width.dp)
                    .requiredHeight(height.dp),
//                    .shadow(0.dp)
//                    .shadow(elevation = elevation, shape = shape)
                shape = shape,
                color = White_50_percent
            ){}
        }
    }
}