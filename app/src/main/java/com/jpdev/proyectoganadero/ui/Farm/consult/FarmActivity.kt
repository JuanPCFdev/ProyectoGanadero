package com.jpdev.proyectoganadero.ui.Farm.consult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jpdev.proyectoganadero.R
import com.jpdev.proyectoganadero.data.network.FirebaseInstance
import com.jpdev.proyectoganadero.databinding.ActivityFarmBinding
import com.jpdev.proyectoganadero.ui.Farm.consult.adapterFarm.adapterFarm
import com.jpdev.proyectoganadero.ui.Farm.register.FarmRegisterActivity

class FarmActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFarmBinding
    //private lateinit var firebaseInstance: FirebaseInstance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFarmBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //firebaseInstance = FirebaseInstance(this)
        initListeners()
    }

    private fun initListeners(){
        binding.btnRegisterFarm.setOnClickListener{
            val intent = Intent(this, FarmRegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}