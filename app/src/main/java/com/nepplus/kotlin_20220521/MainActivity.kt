package com.nepplus.kotlin_20220521

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {

            Log.d("메인화면", "화면눌림")
            Log.e("메인화면","에러로그테스트")


        }

        btnToast.setOnClickListener {

            Toast.makeText(this, "토스트가 눌림", Toast.LENGTH_SHORT).show()


        }

        btnVariable.setOnClickListener {

            // 여기는 문법 연습 (주석 -Ctrl+/)


            //  var/val로 기록 공간(변수) 만들기

            var name1 : String
            val name2 : String

//            두개의 이름 각각 저장 하기

            name1 = "김철수"             //다른 값 대입 가능
            name2 = "이영희"             //다른 값 변경 불가

            name1 = "박철수"
//            name2 = "최영희"





        }





    }
}