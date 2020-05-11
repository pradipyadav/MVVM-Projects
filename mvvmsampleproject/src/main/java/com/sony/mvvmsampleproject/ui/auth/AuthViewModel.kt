package com.sony.mvvmsampleproject.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null

    var authListner: AuthListner? = null

    fun onLoginButtonClick(view: View) {
//        authListner?.onStarted()
        if (email.isNullOrEmpty()) {
            authListner?.onFailure("Enter Email ID")
            return

        } else if (password.isNullOrEmpty()) {
            authListner?.onFailure("Enter Password")

            return
        } else {

            authListner?.onSuccess()
        }
        //Success
    }
}