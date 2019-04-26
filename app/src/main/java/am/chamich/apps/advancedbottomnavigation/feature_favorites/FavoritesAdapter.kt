package am.chamich.apps.advancedbottomnavigation.feature_favorites

import am.chamich.apps.advancedbottomnavigation.R
import am.chamich.apps.advancedbottomnavigation.feature_favorites.model.IFavorite
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FavoritesAdapter: RecyclerView.Adapter<FavoritesAdapter.FavoritesViewHolder>() {

    private val favorites: MutableList<DisplayedFavorite> = mutableListOf()

    class FavoritesViewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem) {
        val name: TextView = viewItem.findViewById(R.id.textview_favorite_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): FavoritesViewHolder {
        return FavoritesViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.item_favorite, parent, false))
    }

    override fun onBindViewHolder(holder: FavoritesViewHolder, position: Int) {
        holder.name.text = favorites[position].name
    }

    override fun getItemCount() = favorites.size

    fun setFavorites(favorites: List<DisplayedFavorite>) {
        this.favorites.addAll(favorites)
        this.notifyDataSetChanged()
    }
}

data class DisplayedFavorite(
    val id: String,
    val name: String
)

val List<IFavorite>.asDisplayedFavorites: List<DisplayedFavorite>
    get() = this.map {
        DisplayedFavorite(it.id, it.name)
    }