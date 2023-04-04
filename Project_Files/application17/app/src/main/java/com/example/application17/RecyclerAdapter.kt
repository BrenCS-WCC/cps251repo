package com.example.application17

import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(myViewModel: MainViewModel) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var viewModel : MainViewModel = myViewModel

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var itemImage : ImageView
        var itemTitle : TextView
        var itemDetail : TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemDetail = itemView.findViewById(R.id.itemDetail)
        }
    }

    override fun onCreateViewHolder(viewGroup : ViewGroup, i: Int) : ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i : Int) {
        viewHolder.itemTitle.text = viewModel.getItemTitle(i)
        viewHolder.itemDetail.text = viewModel.getItemDetail(i)
        viewHolder.itemImage.setImageResource(viewModel.getItemImage(i))

//        viewHolder.itemTitle.text = titles[i]
//        viewHolder.itemDetail.text = details[i]
//        viewHolder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount() : Int {
        return viewModel.getListSize()
    }
}