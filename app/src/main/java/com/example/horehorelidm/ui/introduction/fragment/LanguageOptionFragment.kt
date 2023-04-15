package com.example.horehorelidm.ui.introduction.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.horehorelidm.R
import com.example.horehorelidm.ui.introduction.models.Language
import com.example.horehorelidm.databinding.FragmentLanguageOptionBinding
import com.example.horehorelidm.ui.introduction.adapter.LanguageOptionsAdapter
import com.example.horehorelidm.ui.introduction.data.introductionDummies


class LanguageOptionFragment : Fragment() {

    private var _binding:FragmentLanguageOptionBinding? = null
    private val binding:FragmentLanguageOptionBinding get() = _binding!!
    private lateinit var adapter: LanguageOptionsAdapter

    companion object{
        private const val RECYCLER_VIEW_SPAN_COUNT = 2
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        _binding = FragmentLanguageOptionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setLayout()
    }

    private fun setLayout() {
        binding.apply {
            adapter = getAdapter()
            recyclerView.adapter = adapter
            recyclerView.layoutManager = GridLayoutManager(requireContext(),
                RECYCLER_VIEW_SPAN_COUNT, GridLayoutManager.VERTICAL, false )
        }

    }

    private fun getAdapter(): LanguageOptionsAdapter {
        return LanguageOptionsAdapter(introductionDummies.getLanguageOptionsData(), object:LanguageOptionsAdapter.OnItemClicked{
            override fun onClick(language: Language) {
                view?.findNavController()?.navigate(R.id.action_languageOptionFragment_to_experienceFragment)
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}