package com.fossfreaks.freezethem.ui

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fossfreaks.freezethem.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO : Show onBoarding Screen : Later m8
        // TODO : Check for root permissions
        // TODO : Use package Manager for getting list OF packages
        // TODO : Disable them with for loop
        // TODO : Show if they are disabled
        // TODO : ENABLE as user clicks unFreeze
        test_btn.setOnClickListener {
            getAllApps()
        }
    }

    private fun getAllApps(){
        val packageManager = packageManager
        val packages = packageManager.getInstalledPackages(PackageManager.GET_META_DATA)
        test_btn.text = "Package Name -- Application Info -- Version Name"
        packages.forEach {
            test_btn.text = "${test_btn.text} \n ${it.packageName} -- ${it.applicationInfo.icon} ${it.versionName}"
        }
    }
}