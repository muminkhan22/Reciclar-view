package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.recyclerview.databinding.NameItemBinding

class Adapter(val name : String) : ListAdapter<String,NameViewHolder>(comparator) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {

        return NameViewHolder(NameItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {

        getItem(position).let {

            holder.binding.nameTV.text = getItem(position)

        }

    }

    companion object{

        val comparator = object : DiffUtil.ItemCallback<String>() {
            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
               return oldItem == newItem
            }


        }
    }
}