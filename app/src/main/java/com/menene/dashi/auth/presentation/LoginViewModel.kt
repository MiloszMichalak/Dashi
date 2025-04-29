package com.menene.dashi.auth.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.menene.dashi.auth.domain.use_cases.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    loginUseCase: LoginUseCase
) : ViewModel() {
    var email = mutableStateOf("")
    var password = mutableStateOf("")
}