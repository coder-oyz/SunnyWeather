package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * 提供一个全局获取Context的方式
 */
class SunnyWeatherApplication : Application() {

    companion object {

        const val TOKEN = "RtGbwS8lGDQKst2f" // 填入你申请到的令牌值

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}