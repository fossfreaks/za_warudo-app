package com.fossfreaks.freezethem.helper

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.fossfreaks.freezethem.R

class AlertDialogHelper(private val context: Context) {
    fun displayExceptionAlert(title: String,message : String,clipboardManager: ClipboardManager,exception: Exception){
        AlertDialog.Builder(context)
            .setTitle(title)
            .setMessage(message)
            .setIcon(R.drawable.ic_baseline_error_outline_24)
            .setPositiveButton("Okay, I'll Try later") { dialog, _ ->
                dialog.dismiss()
            }
            .setNegativeButton("Copy the Logs!"){ dialog, _ ->
                val clipData = ClipData.newPlainText("errorLog","$exception")
                clipboardManager.setPrimaryClip(clipData)
                Toast.makeText(context, "Copied Logs!", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            .setNeutralButton("Copy CrashLog Url"){dialog, _ ->
                //TODO : Callback for uploading and copy to clipboard
                dialog.dismiss()
            }
            .show()
    }
    fun displayAlertDialog(title: String,message: String){
        AlertDialog.Builder(context)
            .setTitle(title)
            .setMessage(message)
            .setIcon(R.drawable.ic_baseline_warning_24)
            .setPositiveButton("Okay!"){dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}