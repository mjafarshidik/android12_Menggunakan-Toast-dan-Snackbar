package com.penatabahasa.chapter5topic5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.penatabahasa.chapter5topic5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showName()
        showSnackBar()
    }

    private fun showSnackBar() {
        binding.apply {
            val snackBar = Snackbar.make(btnSnackBar, "Bebas", Snackbar.LENGTH_INDEFINITE)
            snackBar.setAction("back") {
                onBackPressed()
            }
            snackBar.setAction("oke") {
                Toast.makeText(this@MainActivity, "Oke cip", Toast.LENGTH_LONG).show()
            }
            btnSnackBar.setOnClickListener {
                snackBar.show()
            }
        }
    }

    private fun showName() {
        binding.apply {
            btnShowName.setOnClickListener {
                val name = edtName.text.toString()
                if (name == "") {
                    Toast.makeText(this@MainActivity, "Isi dulu namanya coy", Toast.LENGTH_LONG)
                        .show()
                } else {
                    Toast.makeText(this@MainActivity, name, Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}