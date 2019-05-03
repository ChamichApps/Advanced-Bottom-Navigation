package am.chamich.apps.advancedbottomnavigation.core

import android.view.MenuItem
import androidx.fragment.app.Fragment

abstract class CoreFragment : Fragment() {

    protected fun showBackButton() {
        (activity as? CoreActivity)?.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setHasOptionsMenu(true)
    }

    protected fun hideBackButton() {
        (activity as? CoreActivity)?.supportActionBar?.setDisplayHomeAsUpEnabled(false)
        setHasOptionsMenu(false)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                (activity as? CoreActivity)?.onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}