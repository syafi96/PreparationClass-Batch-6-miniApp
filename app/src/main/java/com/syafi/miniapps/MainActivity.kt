package com.syafi.miniapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.text.method.MovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.klinker.android.link_builder.Link
import com.klinker.android.link_builder.applyLinks
import java.util.Calendar.getInstance


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val join :Button = findViewById(R.id.join)
        val sign: TextView = findViewById(R.id.signin)
        val agree:TextView = findViewById(R.id.help)
        val user: EditText = findViewById(R.id.user)
        val pass: EditText = findViewById(R.id.pass)
        val id ="miniapps@gmail.com"
        val passw = "1234567890"

        join.setOnClickListener(){
            val login: String = user.text.toString()
            if (login == id && login==passw){
                Toast.makeText(this,"benar",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"salah",Toast.LENGTH_SHORT).show()
            }
        }

        agree.movementMethod = LinkMovementMethod.getInstance()
        sign.movementMethod = LinkMovementMethod.getInstance()

    }
}

