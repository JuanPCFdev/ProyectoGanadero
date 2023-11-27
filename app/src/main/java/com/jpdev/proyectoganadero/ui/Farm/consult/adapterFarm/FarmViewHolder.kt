package com.jpdev.proyectoganadero.ui.Farm.consult.adapterFarm

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.jpdev.proyectoganadero.databinding.ItemFarmBinding
import com.jpdev.proyectoganadero.domain.model.Farm

class FarmViewHolder(view: View): RecyclerView.ViewHolder(view){

    private var binding = ItemFarmBinding.bind(view)
    fun bind(farm: Farm){
        binding.tvFarm.text = farm.toString()
    }
}