package com.example.databinding

import android.graphics.Typeface.NORMAL
import androidx.lifecycle.ViewModel

class SimpleViewModel :ViewModel(){
    val name = "Grace"
    val lastName = "Hopper"
    var likes = 0
        private set
    fun onLike(){
        likes++
    }
    val populaity:Popularity
    get() {
        return when{
            likes >9 ->Popularity.STAR
            likes >4 ->Popularity.POPULAR
            else ->Popularity.NORMAL
        }
    }
}
enum class Popularity{
    STAR,
    POPULAR,
    NORMAL
}