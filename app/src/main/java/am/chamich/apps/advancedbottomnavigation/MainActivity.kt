package am.chamich.apps.advancedbottomnavigation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeNavigation()
    }

    private fun initializeNavigation() {
        val navigationController = findNavController(R.id.navigationFragment)
        bottomnavigation.setupWithNavController(navigationController)
    }
}
