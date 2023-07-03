package com.example.databindingexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel :ViewModel()
{
    val quoteLiveData= MutableLiveData("My superpower? I am Rich!")

    fun updateQuote(){
        quoteLiveData.value="I am Batman"
    }
}