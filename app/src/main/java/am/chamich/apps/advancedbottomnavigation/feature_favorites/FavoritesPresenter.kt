package am.chamich.apps.advancedbottomnavigation.feature_favorites

import am.chamich.apps.advancedbottomnavigation.feature_favorites.model.Favorite

class FavoritesPresenter {

    internal var view: IFavoritesView? = null

    fun loadFavorites() {
        view?.renderFavorites(listOf(
            Favorite("Favorite 1"),
            Favorite("Favorite 2"),
            Favorite("Favorite 3")))
    }

    fun destroy() {
        view = null
    }
}