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
        btnSendMessage.setOnClickListener {

//            1. 입력한 내용 추출
            val

//            2. 추출한 내용을 다른 화면에 절달(다른 화면으로 이동)

        }

    }
}