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
 * Use the [MotorcycleListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

const val MOTORCYCLE_ID = "MOTORCYCLE_ID"

class MotorcycleListFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_motorcycle_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // List of all TextView IDs for motorcycles
        val motorcycleViews = listOf<View>(
            view.findViewById(R.id.ducati_panigale_v4_r),
            view.findViewById(R.id.bmw_s1000rr),
            view.findViewById(R.id.kawasaki_ninja_h2r),
            view.findViewById(R.id.aprilia_rsv4_1100_factory),
            view.findViewById(R.id.mvd_agusta_f4_rc),
            view.findViewById(R.id.yamaha_yzf_r1m),
            view.findViewById(R.id.honda_cbr1000rr_r_fireblade_sp),
            view.findViewById(R.id.suzuki_gsx_r1000r),
            view.findViewById(R.id.ktm_1290_super_duke_r),
            view.findViewById(R.id.ducati_streetfighter_v4)
        )

        motorcycleViews.forEach { motorcycleView ->
            val fragmentBundle = Bundle()
            fragmentBundle.putInt("MOTORCYCLE_ID", motorcycleView.id)  // Passing the view ID as MOTORCYCLE_ID
            motorcycleView.setOnClickListener(
                Navigation.createNavigateOnClickListener(
                    R.id.navigateToMotorcycleDetailFragment, // Ensure this ID matches your nav_graph action ID
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
         * @return A new instance of fragment MotorcycleListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MotorcycleListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}