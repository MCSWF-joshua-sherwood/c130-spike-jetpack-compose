package com.example.jetpackcomposespike.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

enum class NavigationDestination(
    val route: String,
    val label: String,
    val icon: ImageVector,
    val contentDescription: String
) {
    DISPLAY("display", "Text Display", Icons.Default.Star, "Display Saved Text"),
    INPUT("input", "Text Input", Icons.Default.PlayArrow, "Text Input"),
    SAVE("save", "Save File", Icons.Default.KeyboardArrowDown, "Save File"),
}
