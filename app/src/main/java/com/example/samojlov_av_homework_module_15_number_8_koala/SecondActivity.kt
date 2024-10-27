package com.example.samojlov_av_homework_module_15_number_8_koala


import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.samojlov_av_homework_module_15_number_8_koala.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private lateinit var secondTextViewTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        init()
        animatedText()

    }

    private fun init() {
        secondTextViewTV = binding.secondTextViewTV

    }

    private fun animatedText(){
        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.manifestation)
        val text = getString(R.string.animationText)
        secondTextViewTV.text = text
        secondTextViewTV.startAnimation(animation)
    }
}