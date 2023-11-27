package com.jpdev.proyectoganadero.ui.User.LogIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jpdev.proyectoganadero.R
import com.jpdev.proyectoganadero.data.network.FirebaseInstance
import com.jpdev.proyectoganadero.databinding.ActivityLogInBinding
import com.jpdev.proyectoganadero.ui.User.Register.RegisterUserActivity

class LogInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLogInBinding
    private lateinit var firebaseInstance: FirebaseInstance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseInstance = FirebaseInstance(this)

        initListeners()

    }

    private fun initListeners(){
        binding.btnLogin.setOnClickListener {  }
        binding.btnPassRecord.setOnClickListener {  }
        binding.btnRegister.setOnClickListener { Register() }
    }

    private fun Register(){
        val intent = Intent(this,RegisterUserActivity::class.java)
        startActivity(intent)
        finish()
    }

}