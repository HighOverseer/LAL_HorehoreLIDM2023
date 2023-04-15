package com.example.horehorelidm.ui.introduction.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.horehorelidm.R
import com.example.horehorelidm.databinding.FragmentExperienceBinding

class ExperienceFragment : Fragment() {
    private var _binding:FragmentExperienceBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExperienceBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvOption1.setOnClickListener {
                view.findNavController().navigate(R.id.action_experienceFragment_to_mainpageActivity)
                requireActivity().finish()
            }

            tvOption2.setOnClickListener {
                view.findNavController().navigate(R.id.action_experienceFragment_to_mainpageActivity)
                requireActivity().finish()
            }

            tvOption3.setOnClickListener {
                view.findNavController().navigate(R.id.action_experienceFragment_to_mainpageActivity)
                requireActivity().finish()
            }

            tvOption4.setOnClickListener {
                view.findNavController().navigate(R.id.action_experienceFragment_to_mainpageActivity)
                requireActivity().finish()
            }

            tvOption5.setOnClickListener {
                view.findNavController().navigate(R.id.action_experienceFragment_to_mainpageActivity)
                requireActivity().finish()
            }

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}