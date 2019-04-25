package am.chamich.apps.advancedbottomnavigation.feature_home


import am.chamich.apps.advancedbottomnavigation.R
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HomeFragment : androidx.fragment.app.Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("~~~", "$TAG[$this] - onCreate()")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i("~~~", "$TAG[$this] - onViewCreated()")
        Log.i("~~~", "$TAG[$this] - savedInstanceState: $savedInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.i("~~~", "$TAG[$this] - onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("~~~", "$TAG[$this] - onDestroy()")
    }

    companion object {
        private val TAG = HomeFragment::class.java.simpleName
    }
}
