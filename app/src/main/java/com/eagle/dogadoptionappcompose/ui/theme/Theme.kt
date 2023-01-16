package com.eagle.dogadoptionappcompose.ui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val DarkColorScheme = darkColors(
    primary = Purple200,
    secondary = Teal200,
    background = blueBGNight,
    surface = pinkText,
    onSurface = cardNight
)

private val LightColorScheme = lightColors(
    primary = Purple500,
    secondary = Teal200,
    background = blueBG,
    surface = blueText,
    onSurface = card

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun DogAdoptionAppComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        content = content
    )
}