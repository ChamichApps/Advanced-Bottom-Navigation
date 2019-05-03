package am.chamich.apps.advancedbottomnavigation.feature_favorites


import am.chamich.apps.advancedbottomnavigation.R
import am.chamich.apps.advancedbottomnavigation.core.CoreFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FavoritesContainerFragment : CoreFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorites_container, container, false)
    }

}
