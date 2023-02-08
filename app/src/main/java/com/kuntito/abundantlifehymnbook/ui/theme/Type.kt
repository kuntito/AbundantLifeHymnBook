package com.kuntito.abundantlifehymnbook.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontSize = 22.sp,
        color = Color.White,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        shadow = Shadow(
            color = Color.Black.copy(alpha = 0.12f),
            offset = Offset(x=0f, y=5f),
            blurRadius = 1f
        )
    ),
    body2 = TextStyle(
        fontSize = 17.sp,
        color = Color.White,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.SemiBold,
        shadow = Shadow(
            color = Color.Black.copy(alpha = 0.12f),
            offset = Offset(x=0f, y=5f),
            blurRadius = 1f
        )
    )



    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)