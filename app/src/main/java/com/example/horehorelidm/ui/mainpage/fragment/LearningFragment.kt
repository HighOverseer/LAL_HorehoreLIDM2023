package com.example.horehorelidm.ui.mainpage.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horehorelidm.databinding.FragmentLearningBinding
import com.google.android.material.textfield.MaterialAutoCompleteTextView


class LearningFragment : Fragment() {

    private var _binding: FragmentLearningBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLearningBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = arrayOf("Item 1", "Item 2", "Item 3", "Item 4")
        (binding.learningLanguageSelect.editText as? MaterialAutoCompleteTextView)?.setSimpleItems(
            items
        )

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}