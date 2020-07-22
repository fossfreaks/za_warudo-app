package com.fossfreaks.freezethem.ui

import android.content.pm.ApplicationInfo
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fossfreaks.freezethem.R
import com.fossfreaks.freezethem.adapters.AppListRecyclerViewAdapter
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

//        apps_main_rc.layoutManager = LinearLayoutManager(this)
//        apps_main_rc.adapter = AppListRecyclerViewAdapter(getAllApps())

    }

    private fun getAllApps(): MutableList<PackageInfo> {
        val packageManager = packageManager
        return packageManager.getInstalledPackages(PackageManager.GET_META_DATA)
    }
}