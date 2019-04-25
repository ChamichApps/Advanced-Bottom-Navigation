package am.chamich.apps.advancedbottomnavigation.feature_favorites


import am.chamich.apps.advancedbottomnavigation.R
import am.chamich.apps.advancedbottomnavigation.feature_favorites.model.IFavorite
import am.chamich.apps.advancedbottomnavigation.navigator.isRecreated
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_favorites.recyclerview_favorites

class FavoritesFragment : Fragment(), IFavoritesView {

    private lateinit var viewAdapter: FavoritesAdapter
    private lateinit var presenter: FavoritesPresenter

    init {
        retainInstance = true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewAdapter = FavoritesAdapter()
        presenter = FavoritesPresenter()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializeRecyclerView()

        presenter.view = this
        if (!isRecreated) {
            presenter.loadFavorites()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        presenter.destroy()
        recyclerview_favorites.adapter = null
        recyclerview_favorites.layoutManager = null
    }

    override fun renderFavorites(favorites: List<IFavorite>) {
        Log.d(TAG, "List of Favorites Received.")
        viewAdapter.setFavorites(favorites)
    }

    private fun initializeRecyclerView() {
        recyclerview_favorites.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = viewAdapter
        }
    }

    companion object {
        private val TAG = FavoritesFragment::class.java.simpleName
    }
}
