package com.menene.dashi.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.menene.dashi.presentation.AuthViewModel
import com.menene.dashi.presentation.LoginScreen
import com.menene.dashi.presentation.RegisterScreen
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun NavGraph(
    onNavHostReady: suspend (NavController) -> Unit = { }
) {
    val navController = rememberNavController()
    val authViewModel = koinViewModel<AuthViewModel>()

    NavHost (
        startDestination = Screen.Login,
        navController = navController,
    ) {
         composable<Screen.Login> {
             LoginScreen(navController, authViewModel)
         }

        composable<Screen.Register> {
            RegisterScreen(navController, authViewModel)
        }
    }

    LaunchedEffect(navController) {
        onNavHostReady(navController)
    }
}
