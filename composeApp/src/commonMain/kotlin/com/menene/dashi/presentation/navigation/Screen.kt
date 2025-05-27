package com.menene.dashi.presentation.navigation

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class Screen {
    @Serializable
    @SerialName("login")
    data object Login : Screen()

    @Serializable
    @SerialName("register")
    data object Register : Screen()
}