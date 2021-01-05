package com.example.anton111111

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.anton111111.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _viewBinding: ActivityMainBinding? = null
    private val viewBinding get() = _viewBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(
            R.id.fragment_container, MainFragment.newInstance()
        ).commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _viewBinding = null
    }
}