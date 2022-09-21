package com.palmdev.to_do_app.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.palmdev.to_do_app.util.Action
import com.palmdev.to_do_app.util.Constants

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = Constants.TASK_SCREEN,
        arguments = listOf(navArgument("taskId") {
            type = NavType.IntType
        })
    ) {

    }
}