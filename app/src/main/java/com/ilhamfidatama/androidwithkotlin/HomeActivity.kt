package com.ilhamfidatama.androidwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_USERNAME = "username"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        intent.getStringExtra(EXTRA_USERNAME)
    }
}