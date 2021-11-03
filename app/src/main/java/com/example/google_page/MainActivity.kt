package com.example.google_page

import android.content.Intent
import android.os.Bundle
import android.provider.Settings.Global.getString

import androidx.appcompat.app.AppCompatActivity
import com.example.google_page.R
import com.example.google_page.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        mainButton.setOnClickListener{
//            val intent = Intent(this,activity2::java)
//            startActivity(intent)
//       }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mainButton.setOnClickListener { CheckInfo() }

    }
}
    private fun CheckInfo() {


        val first = binding.firstnameEdit.text.toString()
        val last = binding.lastnameEdit.text.toString()
        val email = binding.emailEdit.text.toString() +("@gmail.com")
        val pass = binding.pass1Edit.text.toString()
        val pass2 = binding.pass2Edit.text.toString()
        val password = pass == pass2


        val check = !(email.contains("!") &&  email.contains("#") && email.contains("-")
                && email.contains("(") && email.contains(")")&& email.contains("="))

        var information =
            if (first.isNotEmpty() && (email.contains("@") && email.contains(".com"))&& last.isNotEmpty() && pass.isNotEmpty() && pass2.isNotEmpty() && check) {
"info"

            } else if (!password) {
                "ERROR!!!\nPlease enter password "


            } else {

                "ERROR!!!\nPlease enter all the information"


            }


        binding.finalResult.text = information
    }



