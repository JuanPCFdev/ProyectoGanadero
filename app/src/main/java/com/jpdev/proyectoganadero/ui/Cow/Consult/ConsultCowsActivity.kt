package com.jpdev.proyectoganadero.ui.Cow.Consult

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jpdev.proyectoganadero.R
import com.jpdev.proyectoganadero.data.network.FirebaseInstance
import com.jpdev.proyectoganadero.databinding.ActivityConsultCowsBinding
import com.jpdev.proyectoganadero.domain.model.Cattle

class ConsultCowsActivity : AppCompatActivity() {
    private lateinit var binding:ActivityConsultCowsBinding
    private lateinit var firebaseInstance: FirebaseInstance
    private lateinit var cowsList:MutableList<Cattle>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConsultCowsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseInstance = FirebaseInstance(this)

    }

    private fun initListeners(){
        binding.btnRegisterCow.setOnClickListener {

        }
    }


}