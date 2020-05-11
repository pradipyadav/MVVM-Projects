package com.sony.mvvmsampleproject.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.sony.mvvmsampleproject.R
import com.sony.mvvmsampleproject.databinding.ActivityLoginBinding
import com.sony.mvvmsampleproject.util.toast

class LoginActivity : AppCompatActivity(), AuthListner {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel
        viewModel.authListner=this
    }

    override fun onStarted() {
        toast("Login Started")
    }

    override fun onSuccess() {
        toast("Login Success")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}
