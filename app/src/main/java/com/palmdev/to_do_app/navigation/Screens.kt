package com.palmdev.to_do_app.navigation

import androidx.navigation.NavController
import com.palmdev.to_do_app.util.Action
import com.palmdev.to_do_app.util.Constants.LIST_SCREEN

class Screens(navController: NavController) {

    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }
}