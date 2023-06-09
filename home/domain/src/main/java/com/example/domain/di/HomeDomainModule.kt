package com.example.domain.di

import com.example.domain.repository.HomeRepository
import com.example.domain.use_case.GetHomeRepositoryUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object HomeDomainModule {
    @Provides
    fun providesGetHomeRepositoryUseCase(homeRepository: HomeRepository): GetHomeRepositoryUseCase {
        return GetHomeRepositoryUseCase(homeRepository)
    }
}