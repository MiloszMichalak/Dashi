package com.menene.dashi.di

import com.menene.dashi.auth.domain.use_cases.LoginUseCase
import com.menene.dashi.auth.presentation.LoginViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ViewModelModule {
    @Provides
    fun provideLoginViewModel(
        loginUseCase: LoginUseCase
    ): LoginViewModel{
        return LoginViewModel(loginUseCase)
    }
}