package com.palmdev.to_do_app.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.palmdev.to_do_app.navigation.destinations.listComposable
import com.palmdev.to_do_app.navigation.destinations.taskComposable
import com.palmdev.to_do_app.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(navHostController: NavHostController) {
    val screen = remember(navHostController) {
        Screens(navController = navHostController)
    }

    NavHost(navController = navHostController, startDestination = LIST_SCREEN) {
        listComposable(navigateToTaskScreen = screen.task) // Extension function
        taskComposable(navigateToListScreen = screen.list)
    }
}