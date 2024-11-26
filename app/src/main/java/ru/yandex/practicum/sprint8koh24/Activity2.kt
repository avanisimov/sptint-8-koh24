package ru.yandex.practicum.sprint8koh24

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SPRINT_8", "$this onCreate")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button?>(R.id.btn)?.text = "Button"
        findViewById<Button?>(R.id.btn)?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val toolbar: Toolbar? = findViewById(R.id.toolbar)
        toolbar?.setTitle(R.string.app_name)
        toolbar?.setNavigationIcon(R.drawable.baseline_arrow_back_24)
        toolbar?.setNavigationOnClickListener {
            finish()
        }
    }


    override fun onStart() {
        super.onStart()
        Log.d("SPRINT_8", "$this onStart")
    }


    override fun onResume() {
        super.onResume()
        Log.d("SPRINT_8", "$this onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SPRINT_8", "$this onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SPRINT_8", "$this onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SPRINT_8", "$this onDestroy")
    }

}