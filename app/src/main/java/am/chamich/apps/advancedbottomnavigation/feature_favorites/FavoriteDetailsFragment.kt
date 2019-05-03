package am.chamich.apps.advancedbottomnavigation.feature_favorites


import am.chamich.apps.advancedbottomnavigation.R
import am.chamich.apps.advancedbottomnavigation.core.CoreFragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FavoriteDetailsFragment : CoreFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("~~~", "$TAG[$this] - onCreate()")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_favorite_details, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showBackButton()
        Log.i("~~~", "$TAG[$this] - onViewCreated()")
        Log.i("~~~", "$TAG[$this] - savedInstanceState: $savedInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        hideBackButton()
        Log.i("~~~", "$TAG[$this] - onDestroyView()")
    }

    companion object {
        private val TAG = FavoriteDetailsFragment::class.java.simpleName
    }
}
