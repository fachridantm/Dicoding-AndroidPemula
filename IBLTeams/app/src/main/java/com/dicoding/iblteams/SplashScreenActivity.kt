package com.dicoding.iblteams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.DarkTheme_TranslucentStatusBar)
        } else {
            setTheme(R.style.AppTheme_TranslucentStatusBar)
        }

        GlobalScope.launch {
            delay(3000)
            MainActivity.start(this@SplashScreenActivity)
            finish()
        }
    }
}