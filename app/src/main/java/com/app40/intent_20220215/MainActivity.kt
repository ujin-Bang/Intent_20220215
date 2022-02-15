package com.app40.intent_20220215

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveToOtherActivity.setOnClickListener {

//            버튼이 눌리면 OtherActivity로 이동

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

    }
}