package com.example.aiblogs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview:RecyclerView=findViewById(R.id.recyclerview)

        val adapter:ArticlesAdapter=ArticlesAdapter(getArticles())

        recyclerview.adapter=adapter

        recyclerview.layoutManager=LinearLayoutManager(this)

    }

    fun getArticles(): List<Article> {

        val articles = ArrayList<Article>()

        articles.add(Article(
            "HubSpot’s AI Website Generator",
            R.drawable.image1,
            "As a writer for the HubSpot blog, I might be biased toward HubSpots tools, but with the free AI website generator, you can create a custom site in a flash. You answer a series of prompts about your business, enter your needs and preferences, the AI generator will seamlessly create a custom site."
        ))

        articles.add(Article(
            "Wix ADI (Artificial Design Intelligence)",
            R.drawable.image2,
            "AI is revolutionizing content creation by automating tasks like editing, generating ideas, and even writing entire articles. This helps creators save time and focus on higher-level tasks."
        ))

        articles.add(Article(
            "ChatGPT",
            R.drawable.image3,
            "AI is transforming the healthcare industry by improving diagnostics, predicting patient outcomes, and even assisting in surgeries, leading to more personalized care."
        ))

        articles.add(Article(
            "GitHub Copilot",
            R.drawable.image4,
            "From chatbots to personalized ad targeting, AI-powered marketing tools are helping businesses engage with customers in a more effective and meaningful way."
        ))

        articles.add(Article(
            "Squarespace",
            R.drawable.image5,
            "AI is revolutionizing the e-commerce industry by offering personalized recommendations, optimizing inventory management, and improving customer service with AI-powered assistants."
        ))

        articles.add(Article(
            "Appy Pie",
            R.drawable.image6,
            "AI and machine learning are helping financial institutions detect fraud, automate trading, and provide personalized financial advice to clients."
        ))

        articles.add(Article(
            "Canva",
            R.drawable.image7,
            "AI plays a critical role in the development of autonomous vehicles, enabling them to navigate, make decisions, and interact with their environment safely."
        ))

        articles.add(Article(
            "Galileo AI",
            R.drawable.image8,
            "AI is reshaping education by providing personalized learning experiences, automating administrative tasks, and helping teachers understand student needs better."
        ))

        articles.add(Article(
            "Adobe's Sensei",
            R.drawable.image9,
            "AI-powered tools are becoming essential in the fight against cybercrime by detecting threats, preventing attacks, and improving overall security posture."
        ))

        articles.add(Article(
            "QuillBot",
            R.drawable.image10,
            "As AI technology advances, questions around ethics, privacy, and the impact on jobs are becoming increasingly important to address."
        ))

        return articles
    }

}