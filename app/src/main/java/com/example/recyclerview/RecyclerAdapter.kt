package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles = arrayOf(
        "Chp 1",
        "Chp 2",
        "Chp 3",
        "Chp 4",
        "Chp 5",
        "Chp 6",
        "Chp 7",
        "Chp 8")

    private var details = arrayOf(
        "Chapter 1 deets",
        "Chapter 2 deets",
        "Chapter 3 deets",
        "Chapter 4 deets",
        "Chapter 5 deets",
        "Chapter 6 deets",
        "Chapter 7 deets",
        "Chapter 8 deets")

    private var images = intArrayOf(
        R.drawable.robot,
        R.drawable.robot,
        R.drawable.robot,
        R.drawable.robot,
        R.drawable.robot,
        R.drawable.robot,
        R.drawable.robot,
        R.drawable.robot)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource((images[position]))
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)

            itemView.setOnClickListener{
                val position: Int = adapterPosition
                Toast.makeText(itemView.context, "Chapter ${titles[position]} was clicked!", Toast.LENGTH_LONG).show()
            }
        }
    }

}