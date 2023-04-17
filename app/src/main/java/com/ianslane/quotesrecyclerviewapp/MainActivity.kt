package com.ianslane.quotesrecyclerviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.ianslane.quotesrecyclerviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), QuoteSelectionRecyclerViewAdapter.CategorySelectionRecyclerViewClickListener {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val categoryRecyclerView = binding.RecyclerView
        categoryRecyclerView.layoutManager = LinearLayoutManager(this)
        categoryRecyclerView.adapter = QuoteSelectionRecyclerViewAdapter(this)

    }

    companion object {
        const val QUOTE_CATEGORY_KEY = "category"
        const val QUOTE_TITLE_KEY = "title"
    }

    override fun listItemClicked(quotesCategory: QuoteCategory) {
        // Can't figure out
        showDailyQuoteForCategory(quotesCategory)
    }

    private fun showDailyQuoteForCategory(quotesCategory: QuoteCategory){
        val listDetailIntent = Intent(this, QuoteDetailActivity::class.java)
        listDetailIntent.putExtra(QUOTE_CATEGORY_KEY, quotesCategory.categoryParameter)
        listDetailIntent.putExtra(QUOTE_TITLE_KEY, quotesCategory.categoryTitle)
        startActivity(listDetailIntent)
    }
}

