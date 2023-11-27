package com.jpdev.proyectoganadero.ui.Farm.deleteEdit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jpdev.proyectoganadero.R
import com.jpdev.proyectoganadero.data.network.FirebaseInstance
import com.jpdev.proyectoganadero.databinding.ActivityFarmEditDeleteBinding
import com.jpdev.proyectoganadero.ui.Farm.register.FarmRegisterActivity
import com.jpdev.proyectoganadero.ui.Home.HomePageActivity

class FarmEditDeleteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFarmEditDeleteBinding
    private lateinit var firebaseInstance: FirebaseInstance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFarmEditDeleteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseInstance = FirebaseInstance(this)
        initListeners()
    }

    private fun initListeners(){
        binding.btnEdit.setOnClickListener{

        }
        binding.btnDelete.setOnClickListener{

        }
        binding.btnRegisterFarm.setOnClickListener{
            val intent = Intent(this, FarmRegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.btnHomePage.setOnClickListener{
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}