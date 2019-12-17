package org.bedu.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavigation(bottom_navigation)
    }

    fun setupNavigation(navigationBar: BottomNavigationView) {
        navigationBar.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.pending_notes -> {
                    val fragment = PendingNotesFragment.newInstance()
                    openFragment(fragment)
                    true
                }
                R.id.completed_notes -> {
                    val fragment = CompletedNotesFragment.newInstance()
                    openFragment(fragment)
                    true
                }
                else -> false
            }
        }
        navigationBar.selectedItemId = R.id.pending_notes
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}