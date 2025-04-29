package com.menene.dashi.di

import com.google.firebase.auth.FirebaseAuth
import com.menene.dashi.auth.data.AuthRepositoryImpl
import com.menene.dashi.auth.domain.repository.AuthRepository
import com.menene.dashi.auth.domain.use_cases.LoginUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    
    @Singleton
    @Provides
    fun provideAuthRepository(
        database: FirebaseAuth
    ): AuthRepository{
        return AuthRepositoryImpl(database)
    }
    
    @Singleton
    @Provides
    fun provideLoginUseCase(
        authRepository: AuthRepository
    ): LoginUseCase {
        return LoginUseCase(authRepository)
    }
    
}