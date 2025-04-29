package com.menene.dashi.auth.data

import com.google.firebase.FirebaseException
import com.google.firebase.FirebaseNetworkException
import com.google.firebase.FirebaseTooManyRequestsException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.auth.FirebaseUser
import com.menene.dashi.auth.FirebaseError
import com.menene.dashi.auth.domain.repository.AuthRepository
import com.menene.dashi.util.Result
import kotlinx.coroutines.tasks.await

class AuthRepositoryImpl(
    public val auth: FirebaseAuth
): AuthRepository {
    override suspend fun login(email: String, password: String): Result<FirebaseUser, FirebaseError> {
        return try {
            val result = auth.signInWithEmailAndPassword(email, password).await()
            Result.Success(result.user!!)
        } catch (e: FirebaseAuthInvalidCredentialsException) {
            Result.Error(FirebaseError.INVALID_CREDENTIALS)
        } catch (e: FirebaseTooManyRequestsException) {
            Result.Error(FirebaseError.TOO_MANY_REQUESTS)
        } catch (e: FirebaseNetworkException) {
            Result.Error(FirebaseError.NETWORK_ERROR)
        } catch (e: FirebaseException) {
            Result.Error(FirebaseError.SERVER_ERROR)
        } catch (e: Exception) {
            Result.Error(FirebaseError.UNKNOWN_ERROR)
        }
    }

    override suspend fun register(email: String, password: String): Result<FirebaseUser, FirebaseError> {
        return try {
            val result = auth.createUserWithEmailAndPassword(email, password).await()
            Result.Success(result.user!!)
        } catch (e: FirebaseAuthUserCollisionException) {
            Result.Error(FirebaseError.EMAIL_ALREADY_IN_USE)
        } catch (e: FirebaseTooManyRequestsException) {
            Result.Error(FirebaseError.TOO_MANY_REQUESTS)
        } catch (e: FirebaseNetworkException) {
            Result.Error(FirebaseError.NETWORK_ERROR)
        } catch (e: FirebaseException) {
            Result.Error(FirebaseError.SERVER_ERROR)
        } catch (e: Exception) {
            Result.Error(FirebaseError.UNKNOWN_ERROR)
        }
    }

    override suspend fun logout(): Boolean {
        return try {
            auth.signOut()
            true
        } catch (e: Exception) {
            false
        }
    }
}