package com.example.horehorelidm.ui.mainpage.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.horehorelidm.data.models.Discussion
import com.example.horehorelidm.databinding.SelectedDiscussionItemBinding
import de.hdodenhof.circleimageview.CircleImageView

class SelectedDiscussionAdapter(private val discussions:List<Discussion>, private val onItemClicked: OnItemClicked):RecyclerView.Adapter<SelectedDiscussionAdapter.SelectedDiscussionViewHolder>() {

    class SelectedDiscussionViewHolder(val binding:SelectedDiscussionItemBinding, val clickedAtPosition:(position:Int)->Unit):RecyclerView.ViewHolder(binding.root){
        init {
            itemView.setOnClickListener {
                clickedAtPosition(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SelectedDiscussionViewHolder {
        val binding = SelectedDiscussionItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SelectedDiscussionViewHolder(binding){adapterPosition->
            onItemClicked.onClick(discussions[adapterPosition])
        }
    }

    override fun onBindViewHolder(
        holder: SelectedDiscussionViewHolder,
        position: Int
    ) {
        val currentItem = discussions[position]
        holder.binding.apply {
            civProfilePict.loadImage(holder.itemView.context, currentItem.threadStarterProfilePic)
            tvTopic.text = currentItem.topic
            tvThreadStarter.text = currentItem.threadStarterName
            tvFirstTag.text = currentItem.tags[0]

        }
    }

    override fun getItemCount()=discussions.size

    private fun CircleImageView.loadImage(context: Context, image:Int){
        Glide.with(context)
            .load(image)
            .into(this)
    }

    interface OnItemClicked{
        fun onClick(discussion:Discussion)
    }
}