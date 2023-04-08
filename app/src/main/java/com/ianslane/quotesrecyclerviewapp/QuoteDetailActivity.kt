package com.ianslane.quotesrecyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ianslane.quotesrecyclerviewapp.databinding.ActivityQuoteDetailBinding

class QuoteDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuoteDetailBinding

    private val quotesMap = mapOf(
        "management" to Quote("I must follow the people. A I not the leader?",
        "drawable/management", "Ben Disraeli"),
        "inspire" to Quote("I've missed more than 9,000 shots in my career. " +
                "I've lost almost 300 games. Twenty-six times, " +
                "I've been trusted to take the game-winning shot and missed. " +
                "I've failed over and over and over again in my life.",
            "drawable/inspire", "Michael Jordan"),
        "sports" to Quote("It ain't over 'til it's over. Baseball is 90 percent mental" +
                ". The other half is physical. On posterity: I always thought that record would " +
                "stand until it was broken.",
            "drawable/sports", "Yogi Bera"),
        "life" to Quote("My father always used to say that when you die, if you've got " +
                "five real friends, then you've had a great life.",
            "drawable/life", "lee iaocca "),
        "funny" to Quote("Because I bought it on sale, I actually made money",
            "drawable/funny", "Every Shopaholic"),
        "love" to Quote("To love is to recognize ; to be loved is to be recognized by the " +
                "other",
            "drawable/love", "thich nhat hanh "),
        "art" to Quote("Art it not what you see, but what you make others see.",
            "drawable/art", "edgar degas "),
        "students" to Quote("An investment in knowledge pays the best interest.",
            "drawable/students", "Benjamin Franklin")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_quote_detail)

        val categoryParameter = intent.getStringExtra(MainActivity.QUOTE_CATEGORY_KEY)
        val categoryTitle = intent.getStringExtra(MainActivity.QUOTE_TITLE_KEY)
        val quote = quotesMap[categoryParameter]

        title = categoryTitle
        binding.imgQuoteImage.setImageResource(resources.getIdentifier(quote?.image, null,
            packageName))
        binding.txtQuoteText.text = quote?.quoteText
        binding.txtQuoteAuthor.text = quote?.author
    }
}

// Left off at video 9

