package com.menene.dashi

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.menene.dashi.navigation.NavGraph
import com.menene.dashi.navigation.ui.screens.LoginScreen

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Dashi",
    ) {
        NavGraph { }
    }
}