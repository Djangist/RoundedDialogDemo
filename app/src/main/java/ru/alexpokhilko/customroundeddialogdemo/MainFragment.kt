package ru.alexpokhilko.customroundeddialogdemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.showDialog).setOnClickListener {
            setFragmentResultListener(KEY) { key, bundle ->
                if (bundle.containsKey(key)) {
                    Toast.makeText(requireContext(), bundle[key].toString(), Toast.LENGTH_LONG).show()
                }
            }
            MainDialogFragment().showNow(parentFragmentManager, "mainDialog")
        }
    }
}