package com.example.dependencyinjectiondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val viewModel = ViewModel(SingleStepCounter())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.button_add).setOnClickListener({
            viewModel.addClicked()
        })


        findViewById<View>(R.id.button_substract).setOnClickListener({
            viewModel.subractClick()
        })


        val countText = findViewById<TextView>(R.id.text_value)
        viewModel.countUpdateCallBack = {count->
            countText.text = "$count"
        }


    }
}