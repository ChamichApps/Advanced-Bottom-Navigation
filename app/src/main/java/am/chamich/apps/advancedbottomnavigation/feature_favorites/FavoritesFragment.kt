package am.chamich.apps.advancedbottomnavigation.feature_favorites


import am.chamich.apps.advancedbottomnavigation.R
import am.chamich.apps.advancedbottomnavigation.core.CoreFragment
import am.chamich.apps.advancedbottomnavigation.feature_favorites.model.IFavorite
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_favorites.*

class FavoritesFragment : CoreFragment(), IFavoritesView, FavoritesAdapter.OnItemClickListener {

    private lateinit var viewAdapter: FavoritesAdapter
    private lateinit var presenter: FavoritesPresenter

    init {
        retainInstance = true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("~~~", "$TAG[$this] - onCreate()")

        viewAdapter = FavoritesAdapter(this)
        presenter = FavoritesPresenter()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_favorites, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i("~~~", "$TAG[$this] - onViewCreated()")
        Log.i("~~~", "$TAG[$this] - savedInstanceState: $savedInstanceState")

        initializeRecyclerView()

        presenter.view = this
        if (!presenter.isInitialLoadCompleted) {
            presenter.loadFavorites()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.i("~~~", "$TAG[$this] - onDestroyView()")

        presenter.destroy()
        recyclerview_favorites.adapter = null
        recyclerview_favorites.layoutManager = null
    }

    override fun renderFavorites(favorites: List<IFavorite>) {
        Log.d(TAG, "List of Favorites Received.")
        viewAdapter.setFavorites(favorites.asDisplayedFavorites)
    }

    override fun onItemClick() {
        findNavController().navigate(R.id.favoriteDetailsFragment)
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
