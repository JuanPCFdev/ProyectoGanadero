package com.jpdev.proyectoganadero.ui.Cow.Consult.Adapter

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.jpdev.proyectoganadero.databinding.ItemCowBinding
import com.jpdev.proyectoganadero.domain.model.Cattle

class CowViewHolder(view: View) : ViewHolder(view) {

    private val binding = ItemCowBinding.bind(view)
    fun bind(cow: Cattle) {
        //Logica para el bind
        binding.delete.setOnClickListener {
            val context = binding.cvCow.context
            //Aqui se puede hacer el intent con el contexto anterior.
            //context.startActivity(intent)
        }

        binding.consult.setOnClickListener {

        }

        binding.edit.setOnClickListener {

        }

    }

}