package com.menene.dashi.domain

interface AuthRepository {
    fun register(email: String, password: String)
}