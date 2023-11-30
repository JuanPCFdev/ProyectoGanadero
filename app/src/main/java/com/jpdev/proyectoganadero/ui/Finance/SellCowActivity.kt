package com.jpdev.proyectoganadero.ui.Finance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jpdev.proyectoganadero.R
import com.jpdev.proyectoganadero.data.network.FirebaseInstance
import com.jpdev.proyectoganadero.databinding.ActivityBuyBinding
import com.jpdev.proyectoganadero.databinding.ActivityFinanceBinding
import com.jpdev.proyectoganadero.databinding.ActivitySellCowBinding

class SellCowActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySellCowBinding
    private lateinit var firebaseInstance: FirebaseInstance
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySellCowBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val key = intent.extras?.getString("userKey")
        val farmKey = intent.extras?.getString("farmKey")
        initComponents(key, farmKey)
    }

    private fun initComponents(key: String?, farmKey: String?) {

    }
}