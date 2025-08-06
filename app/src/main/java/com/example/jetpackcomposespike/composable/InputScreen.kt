package com.example.jetpackcomposespike.composable

import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

@Composable
fun InputScreen() {
    TextField(
        state = rememberTextFieldState(initialText = "Hello"),
        label = { Text("Label") }
    )
}