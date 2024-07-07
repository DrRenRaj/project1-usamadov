package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ElectricCarListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

const val ELECTRIC_CAR_ID = "ELECTRIC_CAR_ID"


class ElectricCarListFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_electric_car_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState:Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val electriccarViews = listOf<View>(
            view.findViewById(R.id.rimac_nevera),
            view.findViewById(R.id.tesla_model_s_plaid),
            view.findViewById(R.id.pininfarina_battista),
            view.findViewById(R.id.aspark_owl),
            view.findViewById(R.id.tesla_roadster),
            view.findViewById(R.id.nio_ep9),
            view.findViewById(R.id.tesla_model_s_performance),
            view.findViewById(R.id.porsche_taycan_turbo_s),
            view.findViewById(R.id.rimac_concept_one),
            view.findViewById(R.id.lotus_evija)
        )

        electriccarViews.forEach { electriccarView ->
            val fragmentBundle = Bundle()
            fragmentBundle.putInt(ELECTRIC_CAR_ID, electriccarView.id)  // Passing the view ID as CAR_ID
            electriccarView.setOnClickListener(
                Navigation.createNavigateOnClickListener(
                    R.id.navigateToElectricCarDetailFragment, // Ensure this ID matches your nav_graph action ID
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
         * @return A new instance of fragment ElectricCarListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ElectricCarListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}