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
import com.google.android.material.floatingactionbutton.FloatingActionButton
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
            activity?.supportFragmentManager!!.beginTransaction().replace(R.id.fragment_frame, ManageAppsFragment())
                .addToBackStack(null)
                .commit()
            dialog?.dismiss()
            activity?.findViewById<FloatingActionButton>(R.id.freeze_btn)?.setImageDrawable(activity?.getDrawable(R.drawable.ic_baseline_check_24))
        }

        whitelist_app_container_menu.setOnClickListener {
            activity?.supportFragmentManager!!.beginTransaction().replace(R.id.fragment_frame, WhitelistAppsFragment())
                .addToBackStack(null)
                .commit()
            dialog?.dismiss()
            activity?.findViewById<FloatingActionButton>(R.id.freeze_btn)?.setImageDrawable(activity?.getDrawable(R.drawable.ic_baseline_check_24))
        }

        setting_app_container_menu.setOnClickListener {
            activity?.supportFragmentManager!!.beginTransaction().replace(R.id.fragment_frame, SettingsFragment())
                .addToBackStack(null)
                .commit()
            dialog?.dismiss()
            activity?.findViewById<FloatingActionButton>(R.id.freeze_btn)?.setImageDrawable(activity?.getDrawable(R.drawable.ic_baseline_check_24))
        }

        about_app_container_menu.setOnClickListener {
            activity?.supportFragmentManager!!.beginTransaction().replace(R.id.fragment_frame, AboutFragment())
                .addToBackStack(null)
                .commit()
            dialog?.dismiss()
            activity?.findViewById<FloatingActionButton>(R.id.freeze_btn)?.hide()
        }
    }
}