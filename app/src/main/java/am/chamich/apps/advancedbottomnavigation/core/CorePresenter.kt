package am.chamich.apps.advancedbottomnavigation.core

abstract class CorePresenter<V> {

    internal var view: V? = null

    fun destroy() {
        view = null
    }
}