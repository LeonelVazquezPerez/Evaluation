package org.bedu.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



class CompletedNotesFragment : Fragment() {

    override  fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_completed_notes, container, false)

        initComponents(view)

        return view
    }

    fun initComponents(view: View) {
        //Hardcoded data

    }

    companion object {
        fun newInstance(): CompletedNotesFragment = CompletedNotesFragment()
    }
}