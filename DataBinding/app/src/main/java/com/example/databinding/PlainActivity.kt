package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.PlainActivityBinding

class PlainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind : PlainActivityBinding = DataBindingUtil.setContentView(this,R.layout.plain_activity)
        bind.name = "wenxin"
        bind.lastName = "wen"
    }
}