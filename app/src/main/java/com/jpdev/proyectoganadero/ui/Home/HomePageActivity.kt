package com.jpdev.proyectoganadero.ui.Home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jpdev.proyectoganadero.databinding.ActivityHomePageBinding
import com.jpdev.proyectoganadero.ui.Cow.CowActivity
import com.jpdev.proyectoganadero.ui.Farm.deleteEdit.FarmEditDeleteActivity
import com.jpdev.proyectoganadero.ui.Finance.FinanceActivity
import com.jpdev.proyectoganadero.ui.User.Consult.UserActivity

class HomePageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners() {
        val key = intent.extras?.getString("userKey")
        binding.btnConsultFarm.setOnClickListener {
            val intent = Intent(this, FarmEditDeleteActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.btnConsultUser.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            intent.putExtra("userKey",key)
            startActivity(intent)
            finish()
        }
        binding.btnConsultCow.setOnClickListener {
            val intent = Intent(this, CowActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.btnConsultFinance.setOnClickListener {
            val intent = Intent(this, FinanceActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}