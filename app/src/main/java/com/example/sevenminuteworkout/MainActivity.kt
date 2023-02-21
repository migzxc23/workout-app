package com.example.sevenminuteworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.example.sevenminuteworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /**
     * To access viewbinding
     */

    private var binding : ActivityMainBinding? = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
//        setContentView(R.layout.activity_main)
        binding?.flStart?.setOnClickListener{
            Toast.makeText(this@MainActivity, "Here we will start the exercise", Toast.LENGTH_LONG).show()
            var intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
        }




//        val flStartButton : FrameLayout = findViewById(R.id.flStart)
//        flStartButton.setOnClickListener{
//        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}