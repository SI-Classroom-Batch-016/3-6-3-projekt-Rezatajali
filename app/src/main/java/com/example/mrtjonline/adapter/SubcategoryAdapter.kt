package com.example.mrtjonline.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mrtjonline.databinding.ListItemBinding
import com.example.mrtjonline.model.SubCategory

class SubcategoryAdapter (
    private val context: Context,
    private val dataset: List<SubCategory>
): RecyclerView.Adapter<SubcategoryAdapter.ItemViewHolder>(){


    class ItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding: ListItemBinding = ListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)
        return ItemViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item: SubCategory = dataset[position]
        holder.binding.itemRV

    }

    override fun getItemCount(): Int {

        return  dataset.size
    }




}