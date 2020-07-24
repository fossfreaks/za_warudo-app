package com.fossfreaks.freezethem.ui.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fossfreaks.freezethem.R
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

        }

        whitelist_app_container_menu.setOnClickListener {

        }

        setting_app_container_menu.setOnClickListener {

        }

        about_app_container_menu.setOnClickListener {

        }
    }
}