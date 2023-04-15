package com.example.horehorelidm.ui.mainpage.adapter

import android.content.Context
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.horehorelidm.databinding.SelectedChatItemBinding
import com.example.horehorelidm.ui.mainpage.models.Chat
import de.hdodenhof.circleimageview.CircleImageView

class ChatAdapter(private val chats:List<Chat>, private val onItemClicked:OnItemClicked):RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {
    class ChatViewHolder(val binding:SelectedChatItemBinding, clickedAtPosition:(position:Int) -> Unit):RecyclerView.ViewHolder(binding.root){
        init {
            itemView.setOnClickListener {
                clickedAtPosition(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val binding = SelectedChatItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChatViewHolder(binding){adapterPosition ->
            onItemClicked.onClick(chats[adapterPosition])
        }
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val currentItem = chats[position]
        holder.binding.apply {
            civProfilePict.loadImage(holder.itemView.context, currentItem.photo)
            if (!currentItem.hasSeen){
                tvName.setTypeface(tvName.typeface, Typeface.BOLD)
                tvMessage.setTypeface(tvName.typeface, Typeface.BOLD)
                tvTime.setTypeface(tvName.typeface, Typeface.BOLD)
            }
            tvName.text = currentItem.name
            tvMessage.text = currentItem.pesan
            tvTime.text = currentItem.time
        }
    }

    override fun getItemCount()=chats.size

    private fun CircleImageView.loadImage(context: Context, image:Int){
        Glide.with(context)
            .load(image)
            .into(this)
    }

    interface OnItemClicked{
        fun onClick(chat:Chat)
    }
}