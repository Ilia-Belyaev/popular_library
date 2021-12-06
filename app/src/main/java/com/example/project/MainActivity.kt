package com.example.project

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.project.R.layout.activity_main


class MainActivity : AppCompatActivity(activity_main), MainView {

    private val presenter = MainPresenter(this)

    private val btn_counter1: Button by lazy { findViewById(R.id.btn_counter1) }
    private val btn_counter2: Button by lazy { findViewById(R.id.btn_counter2) }
    private val btn_counter3: Button by lazy { findViewById(R.id.btn_counter3) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listener = View.OnClickListener {
            when(it){
                btn_counter1->presenter.counterClick0()
                btn_counter2->presenter.counterClick1()
                btn_counter3->presenter.counterClick2()
            }


        }

        btn_counter1.setOnClickListener(listener)
        btn_counter2.setOnClickListener(listener)
        btn_counter3.setOnClickListener(listener)
    }

    //Подсказка к ПЗ: поделить на 3 отдельные функции и избавиться от index

    override fun setButtonText0(text: String) {
        btn_counter1.text = text
    }

    override fun setButtonText1(text: String) {
        btn_counter2.text = text
    }

    override fun setButtonText2(text: String) {
        btn_counter3.text = text
    }

}
