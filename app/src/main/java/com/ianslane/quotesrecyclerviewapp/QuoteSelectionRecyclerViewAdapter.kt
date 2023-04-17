package com.ianslane.quotesrecyclerviewapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ianslane.quotesrecyclerviewapp.databinding.CategoryListViewHolderBinding


class QuoteSelectionRecyclerViewAdapter(private val clickListener: CategorySelectionRecyclerViewClickListener)
    : RecyclerView.Adapter<CategorySectionViewHolder>(){

    private lateinit var binding: CategoryListViewHolderBinding

    val listCategories = arrayOf(
        QuoteCategory("Inspiring Quote of the day", "inspire"),
        QuoteCategory("Management Quote of the day", "management"),
        QuoteCategory("Sports Quote of the day","sports"),
        QuoteCategory("Quote of the day about life","life"),
        QuoteCategory("Funny Quote of the day", "funny"),
        QuoteCategory("Quote of the day about Love","love"),
        QuoteCategory("Art quote of the day","art"),
        QuoteCategory("Quote of the day for students","students")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategorySectionViewHolder {
        binding = CategoryListViewHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategorySectionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listCategories.size
    }

    override fun onBindViewHolder(holder: CategorySectionViewHolder, position: Int) {
        holder.categoryTitle.text = listCategories[position].categoryTitle
        holder.itemView.setOnClickListener {
            clickListener.listItemClicked(listCategories[position])
        }

    }

    interface CategorySelectionRecyclerViewClickListener {
        fun listItemClicked(quoteCategory: QuoteCategory)
    }


}