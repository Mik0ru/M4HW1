package com.example.m4hw1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.m4hw1.R
import com.example.m4hw1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val args: HomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            val user = args.user

            if (user != null) {
                tvName.text = user.name
                tvEmail.text = user.email
                if (user.password != 0 && user.password.toString().length >= 6) {
                    tvPassword.text = user.password.toString()
                } else {
                    tvPassword.text = "Invalid password"
                }

            }

        }

    }
}