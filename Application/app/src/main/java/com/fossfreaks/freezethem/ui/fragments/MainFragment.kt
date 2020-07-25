package com.fossfreaks.freezethem.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.fossfreaks.freezethem.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainFragment : Fragment(R.layout.fragment_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.findViewById<FloatingActionButton>(R.id.freeze_btn)?.setImageDrawable(activity?.getDrawable(R.drawable.ic_freeze_btn))
    }
}