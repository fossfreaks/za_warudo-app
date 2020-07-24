package com.fossfreaks.freezethem.ui

import android.content.pm.ApplicationInfo
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fossfreaks.freezethem.R
import com.fossfreaks.freezethem.adapters.AppListRecyclerViewAdapter
import com.fossfreaks.freezethem.ui.dialog.BottomMenuDialog
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_menu_sheets.*

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

        //apps_main_rc.layoutManager = LinearLayoutManager(this)
        //apps_main_rc.adapter = AppListRecyclerViewAdapter(getAllApps())

        val bottomAppBar = BottomMenuDialog()
        btm_tool_bar.setNavigationOnClickListener {
            bottomAppBar.show(supportFragmentManager,"Show_menu")
        }

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean =  true

    private fun getAllApps(): MutableList<PackageInfo> {
        val packageManager = packageManager
        return packageManager.getInstalledPackages(PackageManager.GET_META_DATA)
    }
}