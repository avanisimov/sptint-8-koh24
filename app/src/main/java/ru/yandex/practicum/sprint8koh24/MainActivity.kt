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
import java.util.concurrent.atomic.AtomicBoolean

class MainActivity : AppCompatActivity() {

    var count = 1

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
           onBtnClick()
        }

        val toolbar: Toolbar? = findViewById(R.id.toolbar)
        toolbar?.setTitle(this.hashCode().toString())
        toolbar?.setNavigationIcon(R.drawable.baseline_arrow_back_24)
        toolbar?.setNavigationOnClickListener {
            finish()
        }


    }

    val isButtonHandling: AtomicBoolean = AtomicBoolean(false)

    private fun onBtnClick() {
        if (isButtonHandling.compareAndSet(false, true)){
            startActivity(Intent(this, MainActivity::class.java))
        }

    }


    override fun onStart() {
        super.onStart()
        Log.d("SPRINT_8", "$this onStart")
        isButtonHandling.set(false)
    }


    override fun onResume() {
        super.onResume()
        Log.d("SPRINT_8", "$this onResume")


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
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