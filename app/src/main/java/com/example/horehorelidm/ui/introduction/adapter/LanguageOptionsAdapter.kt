package com.example.horehorelidm.ui.introduction.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.horehorelidm.data.models.Language
import com.example.horehorelidm.databinding.LanguageOptionItemBinding

class LanguageOptionsAdapter(
    private val languages: List<Language>,
    private val onItemClicked: OnItemClicked
) : RecyclerView.Adapter<LanguageOptionsAdapter.LanguageOptionsViewHolder>() {

    class LanguageOptionsViewHolder(
        val binding: LanguageOptionItemBinding,
        clickedAtPosition: (position: Int) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                clickedAtPosition(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LanguageOptionsViewHolder {
        val binding = LanguageOptionItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return LanguageOptionsViewHolder(binding) { adapterPosition ->
            onItemClicked.onClick(languages[adapterPosition])
        }
    }

    override fun onBindViewHolder(
        holder: LanguageOptionsViewHolder,
        position: Int
    ) {
        val currentItem = languages[position]
        holder.binding.apply {
            imageView.loadImage(holder.itemView.context, currentItem.icFlag)
            tvLanguageName.text = currentItem.languageName
        }
    }

    override fun getItemCount() = languages.size

    private fun ImageView.loadImage(context: Context, imageId: Int) {
        Glide.with(context)
            .load(imageId)
            .into(this)
    }


    interface OnItemClicked {
        fun onClick(language: Language)
    }
}