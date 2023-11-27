package com.jpdev.proyectoganadero.ui.Farm.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.jpdev.proyectoganadero.R
import com.jpdev.proyectoganadero.data.network.FirebaseInstance
import com.jpdev.proyectoganadero.databinding.ActivityFarmRegisterBinding
import com.jpdev.proyectoganadero.domain.model.Cattle
import com.jpdev.proyectoganadero.domain.model.Farm
import com.jpdev.proyectoganadero.domain.model.Receipt
import com.jpdev.proyectoganadero.domain.model.User
import com.jpdev.proyectoganadero.ui.Farm.consult.FarmActivity

class FarmRegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFarmRegisterBinding
    private lateinit var firebaseInstance: FirebaseInstance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFarmRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseInstance = FirebaseInstance(this)
        initListeners()
    }
    private fun initListeners(){
        binding.btnRegisterFarm.setOnClickListener{
            registerFarm()
        }
        binding.btnReturnFarm.setOnClickListener{
            val intent = Intent(this, FarmActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun registerFarm(){
        var key = intent.extras?.getString("userKey")
        try {
            if(validateData()){
                val newFarm = Farm(
                    idFarm = 0,
                    binding.etFarmName.text.toString(),
                    binding.etFarmHectares.text.toString().toDouble(),
                    binding.etFarmCapacity.text.toString().toInt(),
                    binding.etFarmAddres.text.toString(),
                    emptyList<Cattle>().toMutableList(),
                    emptyList<Receipt>().toMutableList()
                )

                firebaseInstance.registerFarm(newFarm,key)
                Toast.makeText(this, "Finca registrada correctamente", Toast.LENGTH_SHORT).show()
            }
            if(validateData()){
                val intent = Intent(this, FarmActivity::class.java )
                startActivity(intent)
                finish()
            }
        }catch (e: Exception){
            Log.e("Registro de Finca", "Error al registrar la finca", e)
            Toast.makeText(this, "Error al registrar la finca", Toast.LENGTH_SHORT).show()
        }

    }

    private fun validateData():Boolean{
        var success = true

        if(binding.etFarmName.text.toString().isNullOrEmpty()){
            Toast.makeText(this, "Nombre invalido", Toast.LENGTH_SHORT).show()
            success = false
        }
        if(binding.etFarmAddres.text.toString().isNullOrEmpty()){
            Toast.makeText(this, "Telefono invalido", Toast.LENGTH_SHORT).show()
            success = false
        }
        if(binding.etFarmCapacity.text.toString().isNullOrEmpty()){
            Toast.makeText(this, "Contraseña invalida", Toast.LENGTH_SHORT).show()
            success = false
        }
        if(binding.etFarmHectares.text.toString().isNullOrEmpty()){
            Toast.makeText(this, "Confirmacion invalida", Toast.LENGTH_SHORT).show()
            success = false
        }

        return success
    }
}