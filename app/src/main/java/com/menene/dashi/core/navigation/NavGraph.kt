package com.menene.dashi.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.menene.dashi.auth.presentation.LoginScreen
import com.menene.dashi.auth.presentation.RegisterScreen

@Composable
fun NavGraph(
    navHostController: NavHostController,
){
    NavHost(
        navController = navHostController,
        startDestination = Screen.LoginScreen
    ) {
        composable<Screen.LoginScreen> {
            LoginScreen()
        }
        
        composable<Screen.RegisterScreen> {
            RegisterScreen()
        }
    }
} 