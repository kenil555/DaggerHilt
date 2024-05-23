package com.exampledemo.kotlindemo

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CryptocurrencyAdapter(private val cryptocurrency: List<Cryptocurrency>) :
    RecyclerView.Adapter<CryptocurrencyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(cryptocurrency[position])
    }

    override fun getItemCount() = cryptocurrency.size

    // Iterating ViewHolder and loading it's
    // content to our Image and Text ViewsT
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(index: Cryptocurrency) {
            Glide.with(itemView.context)
                .load(index.image).dontAnimate()
                .into(itemView.findViewById<ImageView>(R.id.iv_list_images))

            Log.e("TAG", "Bind Items: " + index.image)
            itemView.findViewById<TextView>(R.id.cryptocurrency).text = index.name
        }
    }

}
