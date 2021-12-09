package com.example.project

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.project.R.layout.activity_main
import com.example.project.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(activity_main), MainView {
    private lateinit var binding: ActivityMainBinding
    private val presenter = MainPresenter(this)

    private val btn_counter_first: Button by lazy { binding.btnCounter1 }
    private val btn_counter_second: Button by lazy { binding.btnCounter2 }
    private val btn_counter_third: Button by lazy { binding.btnCounter3 }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listener = View.OnClickListener {
            when(it){
                btn_counter_first->presenter.counterClickFirst()
                btn_counter_second->presenter.counterClickSecond()
                btn_counter_third->presenter.counterClickThird()
            }


        }

        btn_counter_first.setOnClickListener(listener)
        btn_counter_second.setOnClickListener(listener)
        btn_counter_third.setOnClickListener(listener)
    }

    //Подсказка к ПЗ: поделить на 3 отдельные функции и избавиться от index

    override fun setButtonTextFirst(text: String) {
        btn_counter_first.text = text
    }

    override fun setButtonTextSecond(text: String) {
        btn_counter_second.text = text
    }

    override fun setButtonTextThird(text: String) {
        btn_counter_third.text = text
    }

}
