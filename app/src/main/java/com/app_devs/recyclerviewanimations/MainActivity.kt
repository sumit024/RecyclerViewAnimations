package com.app_devs.recyclerviewanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.app_devs.recyclerviewanimations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  var list=ArrayList<String>()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setData()
        binding.rv.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=CustomAdapter(this@MainActivity,list)
        }
        setContentView(binding.root)
    }
    private fun setData()
    {
        list.add("India")
        list.add("Sri Lanka")
        list.add("Australia")
        list.add("Canada")
        list.add("England")
        list.add("Oman")
        list.add("Ireland")
        list.add("West Indies")
        list.add("Pakistan")
        list.add("Afghanistan")
        list.add("Bangladesh")
        list.add("New Zealand")
        list.add("San Francisco")
        list.add("France")
        list.add("Spain")
        list.add("Bhutan")
        list.add("Canada")
        list.add("England")
        list.add("Oman")
        list.add("Ireland")
        list.add("West Indies")
        list.add("Pakistan")
        list.add("Afghanistan")
        list.add("Bangladesh")
        list.add("New Zealand")
    }
}