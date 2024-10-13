package com.example.aiblogs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ArticlesAdapter(val articles:List<Article>):RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {

        val view: View =LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent,false)
        return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
    return articles.size

    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
    val article=articles.get(position)
        holder.title.text=article.title
        holder.image.setImageResource(article.image)
        holder.description.text=article.description
    }

}