package com.kweeksnews.lite

import android.app.Application
import com.onesignal.OneSignal

const val ONESIGNAL_APP_ID = "f97432b8-bdfd-4ceb-90f3-82ddeec78212"

class ApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}