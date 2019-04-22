package am.chamich.apps.advancedbottomnavigation

import am.chamich.apps.advancedbottomnavigation.navigator.RetainStateFragmentNavigator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.plusAssign
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeNavigation()
    }

    private fun initializeNavigation() {
        val navController = findNavController(R.id.fragment_navigation)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_navigation)!!
        val navigator =
            RetainStateFragmentNavigator(this, navHostFragment.childFragmentManager, R.id.fragment_navigation)
        navController.navigatorProvider += navigator
        navController.setGraph(R.navigation.navigation_graph)
        bottomnavigation_navigation.setupWithNavController(navController)
    }
}
