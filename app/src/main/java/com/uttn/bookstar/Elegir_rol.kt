package com.uttn.bookstar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.uttn.bookstar.Administrador.Registrar_Admin
import com.uttn.bookstar.databinding.ActivityElegirRolBinding

class Elegir_rol : AppCompatActivity() {

    private lateinit var binding: ActivityElegirRolBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityElegirRolBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtnRolAdministrador.setOnClickListener{
            //Toast.makeText(applicationContext, "Rol administrador", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@Elegir_rol, Registrar_Admin::class.java))
        }

        binding.BtnRolCliente.setOnClickListener{
            Toast.makeText(applicationContext, "Rol cliente", Toast.LENGTH_SHORT).show()
        }
    }
}