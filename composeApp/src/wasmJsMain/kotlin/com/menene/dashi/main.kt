package com.menene.dashi

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import androidx.navigation.ExperimentalBrowserHistoryApi
import androidx.navigation.bindToNavigation
import com.menene.dashi.navigation.NavGraph
import com.menene.dashi.navigation.ui.screens.LoginScreen
import kotlinx.browser.document
import kotlinx.browser.window

@OptIn(ExperimentalComposeUiApi::class, ExperimentalBrowserHistoryApi::class)
fun main() {
    val body = document.body ?: return
    ComposeViewport(body) {
        NavGraph(
            onNavHostReady = { window.bindToNavigation(it) }
        )
    }
}