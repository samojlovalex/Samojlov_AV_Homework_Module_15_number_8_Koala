package com.example.samojlov_av_homework_module_15_number_8_koala.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.example.samojlov_av_homework_module_15_number_8_koala.R
import com.example.samojlov_av_homework_module_15_number_8_koala.databinding.FragmentStartBinding


@Suppress("DEPRECATION")
class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding
    private lateinit var imageStartIV: ImageView
    private lateinit var startButtonBT: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        animation()
        startButtonBT.setOnClickListener {
            val fragmentRegistration = RegistrationFragment()
            fragmentManager?.beginTransaction()?.replace(R.id.main, fragmentRegistration)?.commit()
        }
    }

    private fun init() {
        imageStartIV = binding.imageStartIV
        startButtonBT = binding.startButtonBT
    }

    private fun animation() {
        val animationOne = AnimationUtils.loadAnimation(context, R.anim.manifestation)
        imageStartIV.startAnimation(animationOne)
        val animationTwo = AnimationUtils.loadAnimation(context, R.anim.move_right)
        startButtonBT.startAnimation(animationTwo)
    }
}