package com.example.horehorelidm.ui.mainpage.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.horehorelidm.databinding.FragmentChatBinding
import com.example.horehorelidm.ui.mainpage.adapter.ChatAdapter
import com.example.horehorelidm.ui.mainpage.data.mainpageDummies
import com.example.horehorelidm.ui.mainpage.models.Chat

class ChatFragment:Fragment() {
    private var _binding:FragmentChatBinding?=null
    private val binding get()=_binding!!
    private val adapter = getAdapter()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setLayout()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun setLayout(){
        binding.apply {
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            recyclerView.addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))
        }
    }

    private fun getAdapter():ChatAdapter{
        return ChatAdapter(mainpageDummies.getChatListData(), object : ChatAdapter.OnItemClicked{
            override fun onClick(chat: Chat) {

            }
        })
    }

}