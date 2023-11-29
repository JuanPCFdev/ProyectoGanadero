package com.jpdev.proyectoganadero.ui.Cow.Consult

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jpdev.proyectoganadero.R
import com.jpdev.proyectoganadero.databinding.ActivityConsultCowsBinding

class ConsultCowsActivity : AppCompatActivity() {
    private lateinit var binding:ActivityConsultCowsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConsultCowsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}