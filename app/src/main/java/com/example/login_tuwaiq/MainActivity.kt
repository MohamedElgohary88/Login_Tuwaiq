package com.example.login_tuwaiq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var username = user_name?.text
        var password = password?.text

        login.setOnClickListener {
            if (username!!.isEmpty() || password!!.isEmpty() || checkbox?.isChecked != true ){
                statue?.text = "Login Failed"
            }else{
                statue?.text = " login successful"
            }

        }
    }
}