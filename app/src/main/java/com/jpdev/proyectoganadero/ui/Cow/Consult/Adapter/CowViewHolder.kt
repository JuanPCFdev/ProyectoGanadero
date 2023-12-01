package com.jpdev.proyectoganadero.ui.Cow.Consult.Adapter

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.jpdev.proyectoganadero.databinding.ItemCowBinding
import com.jpdev.proyectoganadero.domain.model.Cattle
import com.jpdev.proyectoganadero.ui.Cow.Register.RegisterCowActivity

class CowViewHolder(view: View) : ViewHolder(view) {

    private val binding = ItemCowBinding.bind(view)
    fun bind(cow: Cattle,cowKey:String,user:String,farmKey:String) {

        val context = binding.cvCow.context

        binding.tvMarking.text = cow.marking
        binding.tvGender.text = cow.gender
        binding.tvWeight.text = cow.weight.toString()

//        binding.delete.setOnClickListener {
//            val intent = Intent(context, RegisterCowActivity::class.java)
//            intent.putExtra("userKey",user)
//            intent.putExtra("farmKey",farmKey)
//            intent.putExtra("cowKey",cowKey)
//            context.startActivity(intent)
//        }
//
//        binding.consult.setOnClickListener {
//            val intent = Intent(context, RegisterCowActivity::class.java)
//            intent.putExtra("userKey",user)
//            intent.putExtra("farmKey",farmKey)
//            intent.putExtra("cowKey",cowKey)
//            context.startActivity(intent)
//        }
//
//        binding.edit.setOnClickListener {
//            val intent = Intent(context, RegisterCowActivity::class.java)
//            intent.putExtra("userKey",user)
//            intent.putExtra("farmKey",farmKey)
//            intent.putExtra("cowKey",cowKey)
//            context.startActivity(intent)
//        }

    }

}