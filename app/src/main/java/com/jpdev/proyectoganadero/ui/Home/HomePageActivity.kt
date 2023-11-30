package com.jpdev.proyectoganadero.ui.Home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jpdev.proyectoganadero.data.network.FirebaseInstance
import com.jpdev.proyectoganadero.databinding.ActivityHomePageBinding
import com.jpdev.proyectoganadero.ui.Cow.CowActivity
import com.jpdev.proyectoganadero.ui.Farm.deleteEdit.FarmEditDeleteActivity
import com.jpdev.proyectoganadero.ui.Finance.FinanceActivity
import com.jpdev.proyectoganadero.ui.User.Consult.UserActivity

class HomePageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding
    private lateinit var firebaseInstance: FirebaseInstance
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        val key = intent.extras?.getString("userKey")
        val farmKey = intent.extras?.getString("farmKey")

        setContentView(binding.root)
        firebaseInstance = FirebaseInstance(this)

        //Obteniendo los datos de la granja que me estan pasando
        firebaseInstance.getFarmDetails(key.toString(),farmKey.toString()){
            binding.titleHomePage.text = it?.nameFarm
        }

        initListeners(key,farmKey)
    }

    private fun initListeners(key:String?,farmKey:String?) {

        binding.btnConsultFarm.setOnClickListener {
            val intent = Intent(this, FarmEditDeleteActivity::class.java)
            intent.putExtra("userKey",key)
            intent.putExtra("farmKey",farmKey)
            startActivity(intent)
            finish()
        }
        binding.btnConsultUser.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            intent.putExtra("userKey",key)
            intent.putExtra("farmKey",farmKey)
            startActivity(intent)
            finish()
        }
        binding.btnConsultCow.setOnClickListener {
            val intent = Intent(this, CowActivity::class.java)
            intent.putExtra("userKey",key)
            intent.putExtra("farmKey",farmKey)
            startActivity(intent)
            finish()
        }
        binding.btnConsultFinance.setOnClickListener {
            val intent = Intent(this, FinanceActivity::class.java)
            intent.putExtra("userKey",key)
            intent.putExtra("farmKey",farmKey)
            startActivity(intent)
            finish()
        }

    }
}