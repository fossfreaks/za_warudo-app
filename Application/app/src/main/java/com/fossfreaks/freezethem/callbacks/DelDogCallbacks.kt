package com.fossfreaks.freezethem.callbacks

import android.content.ClipboardManager

interface DelDogCallbacks {
    /*
    * @prams uploadCrashLogs
    * This method is used to uploadCrashLogs
    * */
    fun uploadCrashLogs(message:String,clipboardManager: ClipboardManager)
}