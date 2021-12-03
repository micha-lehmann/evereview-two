package com.micha.evereview.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.micha.evereview.databinding.ActivityMainBinding
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), MainContract.View {
    private val layout by lazy {ActivityMainBinding.inflate(layoutInflater)}
    @Inject
    lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.root)

        layout.reviews.layoutManager = LinearLayoutManager(this)
        layout.reviews.adapter = presenter.reviewsAdapter
    }

    @Module
    @InstallIn(SingletonComponent::class)
    object HiltModule {
        @Provides
        fun provideMainActivity() = MainActivity()
    }
}
