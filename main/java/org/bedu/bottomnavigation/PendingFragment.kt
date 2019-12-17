package org.bedu.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class PendingNotesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pending_notes, container, false)

        initComponents(view)

        return view
    }

    private fun initComponents(view: View) {


    }

    private fun makeDialog(): android.app.AlertDialog {
        val builder = android.app.AlertDialog.Builder(this.context)
        val inflater = layoutInflater


        return builder.create()
    }

    companion object {
        fun newInstance(): PendingNotesFragment = PendingNotesFragment()
    }


}