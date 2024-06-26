package com.akirachix.fibonnaci

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.fibonnaci.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fiboNumber=fibonaciNums(100)
        binding.rvNums.layoutManager=GridLayoutManager(this, 2)
        val numAdapter=Fibonnaci_ass(fiboNumber)
        binding.rvNums.adapter=numAdapter


    }
    fun fibonaciNums(n:Int):List<BigInteger> {
        val numbers= mutableListOf(BigInteger.ZERO,BigInteger.ONE)
        while (numbers.size < 100 ){
            numbers.add(numbers[numbers.lastIndex] +numbers[numbers.lastIndex -1])
        }
        return numbers
    }
}