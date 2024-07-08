package com.example.transition

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.transition.Explode
import androidx.transition.Fade

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        with(window){
            requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS)

//            enterTransition = android.transition.Slide()
//            exitTransition =android.transition.Slide()
//
//            enterTransition =android.transition.Fade()
//            exitTransition = android.transition.Fade()

            enterTransition = android.transition.Explode()
            exitTransition = android.transition.Explode()

        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this,SecondActivity::class.java)
        findViewById<Button>(R.id.button).setOnClickListener{
            startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }

    }
}