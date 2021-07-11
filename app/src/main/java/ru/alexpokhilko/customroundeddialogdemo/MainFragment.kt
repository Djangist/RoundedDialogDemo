package ru.alexpokhilko.customroundeddialogdemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class MainFragment: Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.showDialog).setOnClickListener {
            MainDialogFragment().showNow(parentFragmentManager, "mainDialog")
        }
    }
}