package com.example.samojlov_av_homework_module_15_number_8_koala.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.samojlov_av_homework_module_15_number_8_koala.R
import com.example.samojlov_av_homework_module_15_number_8_koala.SecondActivity
import com.example.samojlov_av_homework_module_15_number_8_koala.databinding.FragmentRegistrationBinding

class RegistrationFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationBinding
    private lateinit var signUpTitleTV: TextView
    private lateinit var imageViewIV: ImageView
    private lateinit var userNameSignUpET: EditText
    private lateinit var passwordSignUpET: EditText
    private lateinit var loginSignUpBT: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        animation()
        loginSignUpBT.setOnClickListener {
            if (userNameSignUpET.text.isEmpty() || passwordSignUpET.text.isEmpty()) return@setOnClickListener
            startActivity(Intent(activity, SecondActivity::class.java))
        }
    }

    private fun init() {
        signUpTitleTV = binding.signUpTitleTV
        imageViewIV = binding.imageViewIV
        userNameSignUpET = binding.userNameSignUpET
        passwordSignUpET = binding.passwordSignUpET
        loginSignUpBT = binding.loginSignUpBT
    }

    private fun animation() {
        val animationOne = AnimationUtils.loadAnimation(context, R.anim.move_down)
        val animationTwo = AnimationUtils.loadAnimation(context, R.anim.move_up)
        val animationThree = AnimationUtils.loadAnimation(context, R.anim.manifestation)

        userNameSignUpET.startAnimation(animationOne)
        passwordSignUpET.startAnimation(animationOne)
        loginSignUpBT.startAnimation(animationOne)
        signUpTitleTV.startAnimation(animationTwo)
        imageViewIV.startAnimation(animationThree)
    }

}