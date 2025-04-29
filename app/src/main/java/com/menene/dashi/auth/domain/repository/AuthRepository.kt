package com.menene.dashi.auth.domain.repository

import com.google.firebase.auth.FirebaseUser
import com.menene.dashi.auth.FirebaseError
import com.menene.dashi.util.Result

interface AuthRepository {
    suspend fun login(email: String, password: String): Result<FirebaseUser, FirebaseError>
    suspend fun register(email: String, password: String): Result<FirebaseUser, FirebaseError>
    suspend fun logout(): Boolean
}