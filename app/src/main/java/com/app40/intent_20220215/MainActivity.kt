package com.app40.intent_20220215

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    모든 함수에서 공유할 수 있는 변수.(멤버변수)

    val REQ_CODE_NICKNAME = 1000

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
            val inputMessage = edtMessage.text.toString()

//            2. 추출한 내용을 다른 화면에 절달(다른 화면으로 이동)
            val myInent = Intent(this, ViewMessageActivity::class.java)

//            myIntent에 입력한 내용을 첨부
            myInent.putExtra("message",inputMessage)

            startActivity(myInent)

        }

        btnEdit.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)

//            새로운 닉네임을 받아내러 (결과를 얻으러) 가는 동작.
            startActivityForResult(myIntent, REQ_CODE_NICKNAME) //숫자값으로, 닉네임을 받으러 간다고 구별하는데 사용
        }

    }
}