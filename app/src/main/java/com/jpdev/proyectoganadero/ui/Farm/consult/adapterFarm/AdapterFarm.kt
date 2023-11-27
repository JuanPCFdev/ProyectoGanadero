package com.jpdev.proyectoganadero.ui.Farm.consult.adapterFarm

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jpdev.proyectoganadero.R
import com.jpdev.proyectoganadero.domain.model.Farm

class adapterFarm (val Farm : List<Farm>): RecyclerView.Adapter<FarmViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FarmViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FarmViewHolder(layoutInflater.inflate(R.layout.item_farm,parent,false))
    }

    override fun getItemCount() = Farm.size

    override fun onBindViewHolder(holder: FarmViewHolder, position: Int) {
        val item = Farm[position]
        holder.bind(item)
    }

}