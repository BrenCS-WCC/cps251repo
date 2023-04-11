package com.example.application18

import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(myViewModel: MainViewModel) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var viewModel : MainViewModel = myViewModel

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var itemName : TextView

        init {
            itemName = itemView.findViewById(R.id.name)

        }
    }

    override fun onCreateViewHolder(viewGroup : ViewGroup, i: Int) : ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i : Int) {
        viewHolder.itemName.text = viewModel.getEntry(i)

    }

    override fun getItemCount() : Int {
        return viewModel.getEntryCount()
    }
}