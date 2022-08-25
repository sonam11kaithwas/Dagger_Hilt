package com.hlogi.diforinterface

import android.app.Application
import android.widget.Toast
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by Sonam on 24-08-2022 16:14.
 */

/****contaion all dependency its container provide dependency for all class*****/
@HiltAndroidApp
public  class MyApp : Application() {

    override fun onCreate() {
        instance = this

        super.onCreate()
    }

    fun showToastMsg(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    companion object {
        private lateinit var instance: MyApp

        public  fun getAppInstance(): MyApp {
            return instance
        }
    }
}