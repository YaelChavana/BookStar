package com.uttn.bookstar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uttn.bookstar.Fragmentos_Admin.Fragment_admin_cuenta
import com.uttn.bookstar.Fragmentos_Admin.Fragment_admin_dashboard
import com.uttn.bookstar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        verFragmentoDashboard()

        binding.BottomNvAdmin.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.Menu_panel->{
                    verFragmentoDashboard()
                    true
                }
                R.id.Menu_cuenta->{
                    verFragmentoCuenta()
                    true
                }
                else->{
                    false
                }
            }
        }

    }
    private fun verFragmentoDashboard(){
        val nombre_titulo = "Dashboard"
        binding.TituloRLAdmin.text = nombre_titulo

        val fragment = Fragment_admin_dashboard()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.FragmentsAdmin.id, fragment, "Fragment dashboard")
        fragmentTransaction.commit()
    }

    private fun verFragmentoCuenta(){
        val nombre_titulo = "Mi cuenta"
        binding.TituloRLAdmin.text = nombre_titulo

        val fragment = Fragment_admin_cuenta()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.FragmentsAdmin.id, fragment, "Fragment mi cuenta")
        fragmentTransaction.commit()
    }
}