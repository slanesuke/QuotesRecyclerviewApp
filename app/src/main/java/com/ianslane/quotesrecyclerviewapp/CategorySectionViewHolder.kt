package com.ianslane.quotesrecyclerviewapp

import androidx.recyclerview.widget.RecyclerView
import com.ianslane.quotesrecyclerviewapp.databinding.CategoryListViewHolderBinding

//class CategorySelectionViewHolder(private val binding: CategoryListViewHolderBinding):
//    RecyclerView.ViewHolder(binding.root) {
//
//        val categoryTitle = binding.txtCategoryTitle
//}

class CategorySectionViewHolder (
    private val binding: CategoryListViewHolderBinding
) : RecyclerView.ViewHolder(binding.root) {
    val categoryTitle = binding.txtCategoryTitle
}



