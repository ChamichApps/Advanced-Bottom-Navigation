package am.chamich.apps.advancedbottomnavigation.feature_favorites

import am.chamich.apps.advancedbottomnavigation.R
import am.chamich.apps.advancedbottomnavigation.feature_favorites.model.IFavorite
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FavoritesAdapter: RecyclerView.Adapter<FavoritesAdapter.FavoritesViewHolder>() {

    private val favorites: MutableList<IFavorite> = mutableListOf()

    class FavoritesViewHolder(val textview_name: TextView) : RecyclerView.ViewHolder(textview_name)

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): FavoritesViewHolder {
        val textView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_favorite, parent, false) as TextView
        return FavoritesViewHolder(textView)
    }

    override fun onBindViewHolder(holder: FavoritesViewHolder, position: Int) {
        holder.textview_name.text = favorites[position].name
    }

    override fun getItemCount() = favorites.size

    fun setFavorites(favorites: List<IFavorite>) {
        this.favorites.addAll(favorites)
        this.notifyDataSetChanged()
    }

}