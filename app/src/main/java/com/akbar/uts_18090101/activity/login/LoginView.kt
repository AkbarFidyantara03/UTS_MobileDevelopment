package com.akbar.uts_18090101.activity.login

import com.akbar.uts_18090101.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}