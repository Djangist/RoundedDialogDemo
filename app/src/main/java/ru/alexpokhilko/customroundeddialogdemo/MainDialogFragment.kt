package ru.alexpokhilko.customroundeddialogdemo

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment

class MainDialogFragment: DialogFragment(R.layout.dialog_fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(requireDialog()) {
            window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window?.setGravity(Gravity.BOTTOM)
        }

        view.findViewById<Button>(R.id.ok).setOnClickListener {
            dismiss()
        }
    }
}