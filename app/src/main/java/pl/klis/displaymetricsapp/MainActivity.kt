package pl.klis.displaymetricsapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val width = resources.displayMetrics.widthPixels
        val height = resources.displayMetrics.heightPixels

        val textV = findViewById<TextView>(R.id.textV)
        textV.text = "$width x $height"
    }
}