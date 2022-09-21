package com.palmdev.to_do_app.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.palmdev.to_do_app.util.Constants.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (Int) -> Unit
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument("action") {
            type = NavType.StringType
        })
    ) {

    }
}