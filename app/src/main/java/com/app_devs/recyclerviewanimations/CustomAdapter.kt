package com.app_devs.recyclerviewanimations

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.app_devs.recyclerviewanimations.databinding.ItemRowBinding

class CustomAdapter(private val context: Context,
                    private val list:ArrayList<String>)
    :RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        class MyViewHolder( val binding: ItemRowBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       return MyViewHolder(ItemRowBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is MyViewHolder)
        {
            holder.binding.cardView.startAnimation(AnimationUtils.loadAnimation(context,R.anim.recyclerview_animation))
            holder.binding.tvItemName.text=list[position]
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}