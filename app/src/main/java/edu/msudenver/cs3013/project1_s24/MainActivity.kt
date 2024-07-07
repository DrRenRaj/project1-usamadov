package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCombustion = findViewById<Button>(R.id.btnCombustion)
        val btnElectric = findViewById<Button>(R.id.btnElectric)
        val btnMotorcycles = findViewById<Button>(R.id.btnMotorcycles)

        btnCombustion.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.combustionCarListFragment)
        }
        btnElectric.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.ElectricCarListFragment)
        }
        btnMotorcycles.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.motorcycleListFragment)
        }
    }
}