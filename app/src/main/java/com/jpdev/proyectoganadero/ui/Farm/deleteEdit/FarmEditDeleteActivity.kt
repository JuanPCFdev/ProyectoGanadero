package com.jpdev.proyectoganadero.ui.Farm.deleteEdit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jpdev.proyectoganadero.R
import com.jpdev.proyectoganadero.data.network.FirebaseInstance
import com.jpdev.proyectoganadero.databinding.ActivityFarmEditDeleteBinding
import com.jpdev.proyectoganadero.domain.model.Cattle
import com.jpdev.proyectoganadero.domain.model.Farm
import com.jpdev.proyectoganadero.domain.model.Receipt
import com.jpdev.proyectoganadero.ui.Farm.consult.FarmActivity
import com.jpdev.proyectoganadero.ui.Farm.register.FarmRegisterActivity
import com.jpdev.proyectoganadero.ui.Home.HomePageActivity

class FarmEditDeleteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFarmEditDeleteBinding
    private lateinit var firebaseInstance: FirebaseInstance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFarmEditDeleteBinding.inflate(layoutInflater)
        val key = intent.extras?.getString("userKey")
        val farmKey = intent.extras?.getString("farmKey")
        setContentView(binding.root)
        firebaseInstance = FirebaseInstance(this)
        if (key != null && farmKey != null) {
                initListeners(key, farmKey)
                showInformation(key, farmKey)
        }
    }
    private fun showInformation(key: String, farmKey: String) {
        val etFarmName = binding.etFarmName
        val etFarmHectares = binding.etFarmHectares
        val etFarmNumCows = binding.etFarmCapacity
        val etFarmAddress = binding.etFarmAddres

        firebaseInstance.getUserFarms(key) { farms, keys ->
            farms?.let {
                // Busca la finca directamente por farmKey
                val farmIndex = keys?.indexOf(farmKey)
                if (farmIndex != -1) {
                    val farm = farms[farmIndex!!]
                    etFarmName.setText(farm.nameFarm)
                    etFarmHectares.setText(farm.hectares.toString())
                    etFarmNumCows.setText(farm.numCows.toString())
                    etFarmAddress.setText(farm.address)
                }
            }
        }
    }

    private fun initListeners(key:String, farmKey: String){
            val etFarmName = binding.etFarmName
            val etFarmHectares = binding.etFarmHectares
            val etFarmNumCows = binding.etFarmCapacity
            val etFarmAddress = binding.etFarmAddres

            binding.btnEdit.setOnClickListener {

                val newName = etFarmName.text.toString()
                val newHectares = etFarmHectares.text.toString().toDouble()
                val newNumCows = etFarmNumCows.text.toString().toInt()
                val newAddress = etFarmAddress.text.toString()

                val updatedFarm = Farm(newName, newHectares, newNumCows, newAddress)
                firebaseInstance.editFarm(updatedFarm, key, farmKey)


                Toast.makeText(
                    this@FarmEditDeleteActivity,
                    "Información de la finca actualizada exitosamente",
                    Toast.LENGTH_SHORT
                ).show()
                val intent = Intent(this, HomePageActivity::class.java)
                intent.putExtra("userKey",key)
                intent.putExtra("farmKey",farmKey)
                startActivity(intent)
                finish()
            }

        binding.btnDelete.setOnClickListener{
            firebaseInstance.deleteFarm(key,farmKey)
            Toast.makeText(
                this@FarmEditDeleteActivity,
                "Finca eliminada exitosamente",
                Toast.LENGTH_SHORT
            ).show()
            val intent = Intent(this, FarmActivity::class.java)
            intent.putExtra("userKey",key)
            startActivity(intent)
            finish()
        }
        binding.btnRegisterFarm.setOnClickListener{
            val intent = Intent(this, FarmRegisterActivity::class.java)
            intent.putExtra("userKey",key)
            startActivity(intent)
            finish()
        }
        binding.btnHomePage.setOnClickListener{
            val intent = Intent(this, HomePageActivity::class.java)
            intent.putExtra("userKey",key)
            intent.putExtra("farmKey",farmKey)
            startActivity(intent)
            finish()
        }
    }

}