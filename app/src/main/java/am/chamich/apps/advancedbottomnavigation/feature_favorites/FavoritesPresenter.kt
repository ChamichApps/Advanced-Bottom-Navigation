package am.chamich.apps.advancedbottomnavigation.feature_favorites

class FavoritesPresenter {

    internal var view: IFavoritesView? = null

    fun loadFavorites() {
        view?.renderFavorites(arrayOf("1", "2", "3"))
    }
}