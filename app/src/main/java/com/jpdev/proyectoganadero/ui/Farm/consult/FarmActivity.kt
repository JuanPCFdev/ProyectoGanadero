package com.jpdev.proyectoganadero.ui.Farm.consult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jpdev.proyectoganadero.data.network.FirebaseInstance
import com.jpdev.proyectoganadero.databinding.ActivityFarmBinding
import com.jpdev.proyectoganadero.domain.model.Farm
import com.jpdev.proyectoganadero.ui.Farm.consult.adapterFarm.adapterFarm
import com.jpdev.proyectoganadero.ui.Farm.register.FarmRegisterActivity
import com.jpdev.proyectoganadero.ui.Home.HomePageActivity

class FarmActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFarmBinding
    private lateinit var firebaseInstance: FirebaseInstance

    private lateinit var adapter : adapterFarm
    private var farmList = mutableListOf<Farm>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFarmBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseInstance = FirebaseInstance(this)
        val key = intent.extras?.getString("userKey")
        key?.let {
            firebaseInstance.getUserFarms(it) { farms ->
                farms?.let {
                    farmList.clear()
                    farmList.addAll(farms)
                    adapter.notifyDataSetChanged()
                }
            }
        }
        setUpRecyclerView()
        initListeners(key)
    }

    private fun initListeners(key: String?){
        binding.btnRegisterFarm.setOnClickListener{
            val intent = Intent(this, FarmRegisterActivity::class.java)
            intent.putExtra("userKey",key)
            startActivity(intent)
            finish()

        }

    }
    private fun setUpRecyclerView(){
        val key = intent.extras?.getString("userKey")
        adapter = adapterFarm(farmList){ position ->
            val intent = Intent(this, HomePageActivity::class.java)
            intent.putExtra("userKey", key)
            startActivity(intent)
        }
        binding.rvFarm.adapter = adapter
        binding.rvFarm.layoutManager = LinearLayoutManager(this)
    }


}