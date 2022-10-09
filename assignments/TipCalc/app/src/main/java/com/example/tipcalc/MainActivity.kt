package com.example.tipcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.tipcalc.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener(View.OnClickListener {
            if(binding.typeBox.text.isNotEmpty()){
                var bill = binding.typeBox.text.toString().toFloat()
                var ten = bill * 0.1
                var fifteen = bill * 0.15
                var twenty = bill * 0.20
                binding.textView.setText("Tip ammounts:\n"+"10%: " + ten +"\n"+
                "15%: "+ fifteen + "\n 20%: "+ twenty)
            } else
                binding.textView.setText("Please enter your bill total in the space provided above")
        })
    }
    }