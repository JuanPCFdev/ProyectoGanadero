package com.jpdev.proyectoganadero.ui.Cow.Consult.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jpdev.proyectoganadero.R
import com.jpdev.proyectoganadero.domain.model.Cattle

class CowAdapter(private val cowsList:List<Cattle>):RecyclerView.Adapter<CowViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CowViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CowViewHolder(layoutInflater.inflate(R.layout.item_cow,parent,false))
    }

    override fun getItemCount() = cowsList.size

    override fun onBindViewHolder(holder: CowViewHolder, position: Int) {
        val item = cowsList[position]
        holder.bind(item)
    }
}