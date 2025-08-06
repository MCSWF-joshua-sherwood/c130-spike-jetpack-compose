package com.example.jetpackcomposespike.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackcomposespike.model.NavigationDestination

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: NavigationDestination,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController,
        startDestination = startDestination.route
    ) {
        NavigationDestination.entries.forEach { destination ->
            composable(destination.route) {
                when (destination) {
                    NavigationDestination.INPUT -> SongsScreen()
//                    NavigationDestination.DISPLAY -> AlbumScreen()
//                    NavigationDestination.SAVE -> PlaylistScreen()
                }
            }
        }
    }
}