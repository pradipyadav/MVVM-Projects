package com.sony.mvvmsampleproject.ui.auth

interface AuthListner {

    fun onStarted()
    fun onSuccess()
    fun onFailure(message:String)

}