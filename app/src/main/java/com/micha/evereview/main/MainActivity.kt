package com.micha.evereview.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.micha.evereview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainPresenter.View {
    private val layout by lazy {ActivityMainBinding.inflate(layoutInflater)}
    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.root)

        layout.reviews.layoutManager = LinearLayoutManager(this)
        layout.reviews.adapter = presenter.reviewsAdapter
    }
}
