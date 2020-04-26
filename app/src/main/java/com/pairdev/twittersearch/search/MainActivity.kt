package com.pairdev.twittersearch.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pairdev.twittersearch.R
import dagger.android.AndroidInjection

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)
    }
}