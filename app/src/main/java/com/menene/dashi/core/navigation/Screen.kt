package com.menene.dashi.core.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen(){
    @Serializable
    data object LoginScreen
    @Serializable
    data object RegisterScreen
}
