package com.example.horehorelidm.ui.mainpage.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.horehorelidm.ui.mainpage.models.Discussion
import com.example.horehorelidm.databinding.FragmentForumDiskusiBinding
import com.example.horehorelidm.ui.mainpage.adapter.SelectedDiscussionAdapter
import com.example.horehorelidm.ui.mainpage.data.mainpageDummies


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
            recyclerView.addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))
        }
    }

    private fun getAdapter():SelectedDiscussionAdapter{
        return SelectedDiscussionAdapter(mainpageDummies.getSelectedDiscussionsData(), object : SelectedDiscussionAdapter.OnItemClicked{
            override fun onClick(discussion: Discussion) {

            }
        })
    }

}