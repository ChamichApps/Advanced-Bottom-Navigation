package am.chamich.apps.advancedbottomnavigation


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HomeFragment : androidx.fragment.app.Fragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        Log.i("~~~", "$TAG[$this] - onAttach()")
    }

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

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        Log.i("~~~", "$TAG[$this] - onViewStateRestored($savedInstanceState)")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.i("~~~", "$TAG[$this] - onSaveInstanceState($outState)")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.i("~~~", "$TAG[$this] - onDestroyView()")
    }

    override fun onDetach() {
        super.onDetach()

        Log.i("~~~", "$TAG[$this] - onDetach()")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("~~~", "$TAG[$this] - onDestroy()")
    }

    companion object {
        private val TAG = HomeFragment::class.java.simpleName
    }
}
