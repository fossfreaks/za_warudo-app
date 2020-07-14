package com.fossfreaks.freezethem.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.ImageViewCompat
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.fossfreaks.freezethem.R
import com.google.android.material.checkbox.MaterialCheckBox
import com.google.android.material.textview.MaterialTextView

class AppListRecyclerViewAdapter(
    private val listOfApplications:MutableList<PackageInfo>) : RecyclerView.Adapter<AppListRecyclerViewAdapter.AppListHolder>(){
    inner class AppListHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        lateinit var constraintView : ConstraintLayout
        lateinit var appName : MaterialTextView
        lateinit var appPackageName : MaterialTextView
        lateinit var appType : MaterialTextView
        lateinit var appIcon : ImageView
        lateinit var isCheckedToFreeze : MaterialCheckBox
        fun initHolder(){
            constraintView = itemView.findViewById(R.id.freezeItemLayout)
            appName = itemView.findViewById(R.id.appNameTextView)
            appType = itemView.findViewById(R.id.typeOfappTextView)
            appPackageName = itemView.findViewById(R.id.packagenameTextView)
            appIcon = itemView.findViewById(R.id.appIconImageView)
            isCheckedToFreeze = itemView.findViewById(R.id.isAddedFreezeCheck)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppListHolder {
        return AppListHolder(LayoutInflater.from(parent.context).inflate(R.layout.app_item,parent,false))
    }

    override fun getItemCount(): Int {
        return listOfApplications.size
    }

    override fun onBindViewHolder(holder: AppListHolder, position: Int) {
        holder.initHolder()
        val packageManager = holder.itemView.context.packageManager
        holder.appName.text = listOfApplications[position].applicationInfo.loadLabel(packageManager)
        holder.appPackageName.text = listOfApplications[position].packageName
        holder.appType.text = if(isSystemApp(listOfApplications[position])) "System app" else "User app"
        holder.appIcon.setImageDrawable(listOfApplications[position].applicationInfo.loadIcon(packageManager))
        holder.isCheckedToFreeze.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                Toast.makeText(holder.itemView.context, "Holdup", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(holder.itemView.context, "No", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun isSystemApp(packageInfo: PackageInfo): Boolean {
        return packageInfo.applicationInfo.sourceDir.contains("/system")
    }
}