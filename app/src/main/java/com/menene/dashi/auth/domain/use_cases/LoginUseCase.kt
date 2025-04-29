package com.menene.dashi.auth.domain.use_cases

import com.google.firebase.auth.FirebaseUser
import com.menene.dashi.auth.FirebaseError
import com.menene.dashi.auth.domain.repository.AuthRepository
import com.menene.dashi.util.Result

class LoginUseCase(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(email: String, password: String): Result<FirebaseUser, FirebaseError> {
        return authRepository.login(email, password)
    }
}
