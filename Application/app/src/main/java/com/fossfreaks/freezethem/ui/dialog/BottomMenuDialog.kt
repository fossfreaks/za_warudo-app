package com.fossfreaks.freezethem.ui.dialog

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fossfreaks.freezethem.R
import com.fossfreaks.freezethem.ui.fragments.AboutFragment
import com.fossfreaks.freezethem.ui.fragments.ManageAppsFragment
import com.fossfreaks.freezethem.ui.fragments.SettingsFragment
import com.fossfreaks.freezethem.ui.fragments.WhitelistAppsFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_menu_sheets.*

class BottomMenuDialog : BottomSheetDialogFragment(){
    init {

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_menu_sheets,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        manage_app_container_menu.setOnClickListener {
            activity?.supportFragmentManager!!.beginTransaction().replace(R.id.fragment_frame,
                ManageAppsFragment()
            ).commit()
            dialog?.dismiss()

        }

        whitelist_app_container_menu.setOnClickListener {
            activity?.supportFragmentManager!!.beginTransaction().replace(R.id.fragment_frame,
                WhitelistAppsFragment()
            ).commit()
            dialog?.dismiss()
        }

        setting_app_container_menu.setOnClickListener {
            activity?.supportFragmentManager!!.beginTransaction().replace(R.id.fragment_frame,
                SettingsFragment()
            ).commit()
            dialog?.dismiss()
        }

        about_app_container_menu.setOnClickListener {
            activity?.supportFragmentManager!!.beginTransaction().replace(R.id.fragment_frame,
                AboutFragment()
            ).commit()
            dialog?.dismiss()
        }
    }
}