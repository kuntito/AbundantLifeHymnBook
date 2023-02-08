package com.kuntito.abundantlifehymnbook.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = DarkBlue300,
    primaryVariant = Blue100,
    secondary = Pink200,
    background = DarkBlue300,
    onBackground = Color.White,
    onPrimary = Color.White
)

private val LightColorPalette = lightColors(
    primary = Blue400,
    surface = Blue400,
    primaryVariant = Blue100,
    secondary = Pink200,
    background = Blue400,
    onBackground = Color.White,
    onPrimary = Color.White,
    onSurface = Color.White

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun AbundantLifeHymnBookTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes
    ){
        CompositionLocalProvider(
            LocalRippleTheme provides RippleCustomTheme,
            content = content
        )
    }
}

object RippleCustomTheme: RippleTheme {

    //Your custom implementation...
    @Composable
    override fun defaultColor() =
        RippleTheme.defaultRippleColor(
            Color.Black,
            lightTheme = true
        )

    @Composable
    override fun rippleAlpha(): RippleAlpha =
        RippleTheme.defaultRippleAlpha(
            Color.White,
            lightTheme = true
        )
}