package com.micha.evereview.main

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class MainModule {
    @Binds
    abstract fun bindView(activity: MainActivity): MainContract.View

    @Binds
    abstract fun bindPresenter(presenter: MainPresenter): MainContract.Presenter
}
