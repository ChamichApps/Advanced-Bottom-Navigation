package am.chamich.apps.advancedbottomnavigation.feature_favorites

import am.chamich.apps.advancedbottomnavigation.R
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FavoritesAdapter: RecyclerView.Adapter<FavoritesAdapter.FavoritesViewHolder>() {

    var dataset: Array<String> = emptyArray()

    class FavoritesViewHolder(val textview_name: TextView) : RecyclerView.ViewHolder(textview_name)

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): FavoritesViewHolder {
        val textView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_favorite, parent, false) as TextView
        return FavoritesViewHolder(textView)
    }

    override fun onBindViewHolder(holder: FavoritesViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textview_name.text = dataset[position]
    }

    override fun getItemCount() = dataset.size

}