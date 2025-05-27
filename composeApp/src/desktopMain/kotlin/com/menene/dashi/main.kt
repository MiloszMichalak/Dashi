package com.menene.dashi

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.menene.dashi.presentation.navigation.NavGraph

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Dashi",
    ) {
        NavGraph { }
    }
}