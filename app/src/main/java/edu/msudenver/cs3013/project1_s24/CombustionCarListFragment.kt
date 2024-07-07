package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.navigation.Navigation

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CombustionCarListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

const val CAR_ID = "CAR_ID"


class CombustionCarListFragment : Fragment() {


    private lateinit var listView: ListView

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_combustion_car_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState:Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val carViews = listOf<View>(
            view.findViewById(R.id.bugatti_chiron_ss),
            view.findViewById(R.id.koenigsegg_jesko),
            view.findViewById(R.id.hennessey_venom),
            view.findViewById(R.id.ssc_tuatara),
            view.findViewById(R.id.bugatti_veyron_ss),
            view.findViewById(R.id.porsche_918),
            view.findViewById(R.id.ferrari_laferrari),
            view.findViewById(R.id.mclaren_p1),
            view.findViewById(R.id.lamborghini_aventador),
            view.findViewById(R.id.ferrari_sf90),
        )
        carViews.forEach { carView ->
            val fragmentBundle = Bundle()
            fragmentBundle.putInt(CAR_ID, carView.id)
            carView.setOnClickListener(
                Navigation.createNavigateOnClickListener(
                    R.id.navigateToCombustionCarDetailFragment, // Ensure this ID matches your nav_graph action ID
                    fragmentBundle
                )
            )
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CombustionCarListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CombustionCarListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}