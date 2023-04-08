package com.ianslane.quotesrecyclerviewapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ianslane.quotesrecyclerviewapp.databinding.CategoryListViewHolderBinding

@Suppress("DEPRECATION")
class QuoteSelectionRecyclerViewAdapter(private val clickListener:
                                        CategorySelectionRecyclerViewClickListener):
    RecyclerView.Adapter<CategorySelectionViewHolder>() {

    private lateinit var binding: CategoryListViewHolderBinding

    private val listCategories = arrayOf(
        QuoteCategory("Inspiring Quote of the day", "inspire"),
        QuoteCategory("Management Quote of the day", "management"),
        QuoteCategory("Sports Quote of the day", "sports"),
        QuoteCategory("Quote of the day about life", "life"),
        QuoteCategory("Funny Quote of the day", "funny"),
        QuoteCategory("Quote of the day about Love", "love"),
        QuoteCategory("Quote of the day for students", "student"),
        QuoteCategory("Art Quote of the day", "art")


    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategorySelectionViewHolder {
        binding = CategoryListViewHolderBinding.inflate(LayoutInflater.from(parent.context), parent)
        return CategorySelectionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listCategories.size
    }

    override fun onBindViewHolder(holder: CategorySelectionViewHolder, position: Int) {
        holder.categoryTitle.text = listCategories[position].categoryTitle
        holder.itemView.setOnClickListener {
            clickListener.listItemClicked(listCategories[position])
        }

    }

    interface CategorySelectionRecyclerViewClickListener{
        fun listItemClicked(quotesCategory: QuoteCategory)
    }


}