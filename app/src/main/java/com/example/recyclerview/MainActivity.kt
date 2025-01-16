package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding:ActivityMainBinding

    val personNames = listOf<String>(
        "Alice", "Bob", "Charlie", "David", "Ella", "Frank", "Grace", "Hannah",
        "Ivy", "Jack", "Katie", "Liam", "Mia", "Noah", "Olivia", "Paul",
        "Quinn", "Ruby", "Sophia", "Tom", "Uma", "Victor", "Willow", "Xander",
        "Yara", "Zane", "Aaron", "Beth", "Cameron", "Diana", "Ethan",
        "Fiona", "George", "Hazel", "Isaac", "Julia", "Kevin", "Lucy", "Mason",
        "Nina", "Oscar", "Penny", "Quincy", "Rose", "Samuel", "Tara", "Ulysses",
        "Violet", "Wesley", "Xenia", "Yvonne"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ad = Adapter(personNames.toString())
        ad.submitList(personNames)

        binding.recyclerView.adapter = ad

    }
}