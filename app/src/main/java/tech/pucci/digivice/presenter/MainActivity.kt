package tech.pucci.digivice.presenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tech.pucci.digivice.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_main)
    }
}
