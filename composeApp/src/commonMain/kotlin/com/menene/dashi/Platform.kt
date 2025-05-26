package com.menene.dashi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform