package am.chamich.apps.advancedbottomnavigation.feature_favorites

import am.chamich.apps.advancedbottomnavigation.feature_favorites.model.IFavorite

interface IFavoritesView {

    fun renderFavorites(favorites: List<IFavorite>)
}