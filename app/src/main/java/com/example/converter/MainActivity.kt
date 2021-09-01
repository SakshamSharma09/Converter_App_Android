package com.example.converter

import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.R.id.mass

class MainActivity : AppCompatActivity(), View.OnClickListener{

    lateinit var mass : Button
    lateinit var height : Button
    lateinit var currency : Button
    lateinit var temp : Button
    lateinit var kg : EditText
    lateinit var cm : EditText
    lateinit var dollars : EditText
    lateinit var fahr : EditText
    lateinit var g : TextView
    lateinit var ft : TextView
    lateinit var rupees : TextView
    lateinit var cel : TextView

    @Nullable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mass = findViewById(R.id.mass)
        height = findViewById(R.id.height)
        currency = findViewById(R.id.currency)
        temp = findViewById(R.id.temp)
        kg = findViewById(R.id.kg)
        cm = findViewById(R.id.cm)
        dollars = findViewById(R.id.dollars)
        fahr = findViewById(R.id.fahr)
        g = findViewById(R.id.g)
        ft = findViewById(R.id.ft)
        rupees = findViewById(R.id.rupees)
        cel = findViewById(R.id.cel)

        mass.setOnClickListener(this)
        height.setOnClickListener(this)
        currency.setOnClickListener(this)
        temp.setOnClickListener(this)
    }


    override fun onClick(view: View?) {
        when(view!!.id){
            R.id.mass ->{
                g.text = ((kg.text.toString().toFloat()) *1000).toString() + " g"
            }

            R.id.height ->{
                ft.text = ((cm.text.toString().toFloat()) / 30.48).toString() + " ft"
            }
            R.id.currency ->{
                rupees.text = ((dollars.text.toString().toFloat()) / 73.0).toString() + " ₹"
            }
            R.id.temp ->{
                cel.text = (((fahr.text.toString().toFloat())-32)/1.8).toString() + " ℃"
            }
        }
    }


}