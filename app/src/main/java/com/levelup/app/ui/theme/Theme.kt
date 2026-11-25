package com.levelup.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LevelUpColors = darkColorScheme(
    primary = Color(0xFF74F7A2),
    onPrimary = Color(0xFF001B0D),
    surface = Color(0xFF0D1712),
    onSurface = Color(0xFFE7F1EA),
    onSurfaceVariant = Color(0xFFB8C8BD),
)

@Composable
fun LevelUpTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LevelUpColors,
        content = content,
    )
}
