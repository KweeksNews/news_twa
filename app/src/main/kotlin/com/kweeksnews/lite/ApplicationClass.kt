package com.kweeksnews.lite

import android.app.Application
import com.onesignal.OneSignal

const val ONESIGNAL_APP_ID = "7ec3d423-9f1c-4d2f-bff6-cb9b5e6a0edc"

class ApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}