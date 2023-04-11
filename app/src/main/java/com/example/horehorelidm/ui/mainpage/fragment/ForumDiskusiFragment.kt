package com.example.horehorelidm.ui.mainpage.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.horehorelidm.data.models.Discussion
import com.example.horehorelidm.databinding.FragmentForumDiskusiBinding
import com.example.horehorelidm.ui.introduction.data.data
import com.example.horehorelidm.ui.mainpage.adapter.SelectedDiscussionAdapter


class ForumDiskusiFragment : Fragment() {

    private var _binding:FragmentForumDiskusiBinding?=null
    private val binding:FragmentForumDiskusiBinding get() = _binding!!
    private val adapter = getAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentForumDiskusiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setAdapter()


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun setAdapter(){
        binding.apply {
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(requireContext())

        }
    }

    private fun getAdapter():SelectedDiscussionAdapter{
        return SelectedDiscussionAdapter(data.getSelectedDiscussionsData(), object : SelectedDiscussionAdapter.OnItemClicked{
            override fun onClick(discussion: Discussion) {

            }
        })
    }

}