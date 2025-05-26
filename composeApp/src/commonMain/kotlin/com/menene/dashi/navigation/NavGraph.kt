package com.menene.dashi.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.menene.dashi.navigation.ui.screens.LoginScreen
import com.menene.dashi.navigation.ui.screens.RegisterScreen

@Composable
fun NavGraph(
    onNavHostReady: suspend (NavController) -> Unit = { }
) {
    val navController = rememberNavController()

    NavHost (
        startDestination = Screen.Login,
        navController = navController,
    ) {
         composable<Screen.Login> {
             LoginScreen(navController)
         }

        composable<Screen.Register> {
            RegisterScreen(navController)
        }
    }

    LaunchedEffect(navController) {
        onNavHostReady(navController)
    }
}
