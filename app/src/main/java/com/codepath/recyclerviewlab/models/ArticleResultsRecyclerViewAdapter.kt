package com.codepath.recyclerviewlab.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.codepath.recyclerviewlab.R

class ArticleResultsRecyclerViewAdapter(val articles: ArrayList<Article>): RecyclerView.Adapter<ArticleResultsRecyclerViewAdapter.ViewHolder> () {
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        fun bind(article: Article) {
            tvTitle.text = article.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleResultsRecyclerViewAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)

        //Inflate our item layout
        val view = inflater.inflate(R.layout.fragment_article_result, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ArticleResultsRecyclerViewAdapter.ViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}