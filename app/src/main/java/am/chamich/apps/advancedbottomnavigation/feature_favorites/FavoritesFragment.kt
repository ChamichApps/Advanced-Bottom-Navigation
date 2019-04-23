package am.chamich.apps.advancedbottomnavigation.feature_favorites


import am.chamich.apps.advancedbottomnavigation.R
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_favorites.recyclerview_favorites

class FavoritesFragment : Fragment(), IFavoritesView {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: FavoritesAdapter
    private var presenter: FavoritesPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("~~~", "$TAG[$this] - onCreate()")

        viewAdapter = FavoritesAdapter()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i("~~~", "$TAG[$this] - onViewCreated()")
        Log.i("~~~", "$TAG[$this] - savedInstanceState: $savedInstanceState")
        initializeRecyclerView()


        if (presenter == null) {
            presenter = FavoritesPresenter().apply {
                this.view = this@FavoritesFragment
                this.loadFavorites()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.i("~~~", "$TAG[$this] - onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("~~~", "$TAG[$this] - onDestroy()")
    }

    override fun renderFavorites(favorites: Array<String>) {
        viewAdapter.dataset = favorites
        viewAdapter.notifyDataSetChanged()
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
