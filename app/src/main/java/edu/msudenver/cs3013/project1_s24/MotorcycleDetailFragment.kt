package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MotorcycleDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MotorcycleDetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private val motoName: TextView?
        get() = view?.findViewById(R.id.motorcycle_name)
    private val motoDetails: TextView?
        get() = view?.findViewById(R.id.motorcycle_details)
    private val motoPerformance: TextView?
        get() = view?.findViewById(R.id.motorcycle_performance)

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
        return inflater.inflate(R.layout.fragment_motorcycle_detail, container, false)
    }

    fun setMotorcycleDetails(motorcycleId: Int) {
        when (motorcycleId) {
            R.id.ducati_panigale_v4_r -> {
                motoName?.text = getString(R.string.ducati_panigale_v4_r)
                motoDetails?.text = getString(R.string.motorcycle_details, "Ducati's high-performance superbike with a 998cc V4 engine and advanced electronics.")
                motoPerformance?.text = getString(R.string.motocycle_performance, "Top speed: 199 mph and 0-60 mph: 2.5 seconds")
            }

            R.id.bmw_s1000rr -> {
                motoName?.text = getString(R.string.bmw_s1000rr)
                motoDetails?.text = getString(R.string.motorcycle_details, "BMW's flagship superbike with a 999cc inline-four engine and dynamic traction control.")
                motoPerformance?.text = getString(R.string.motocycle_performance, "Top speed: 188 mph and 0-60 mph: 3.1 seconds")
            }

            R.id.kawasaki_ninja_h2r -> {
                motoName?.text = getString(R.string.kawasaki_ninja_h2r)
                motoDetails?.text = getString(R.string.motorcycle_details, "Kawasaki's supercharged track-only motorcycle with a 998cc inline-four engine.")
                motoPerformance?.text = getString(R.string.motocycle_performance, "Top speed: 249 mph and 0-60 mph: 2.5 seconds")
            }

            R.id.aprilia_rsv4_1100_factory -> {
                motoName?.text = getString(R.string.aprilia_rsv4_1100_factory)
                motoDetails?.text = getString(R.string.motorcycle_details, "Aprilia's race-bred superbike with a 1078cc V4 engine and advanced aerodynamics.")
                motoPerformance?.text = getString(R.string.motocycle_performance, "Top speed: 199 mph and 0-60 mph: 2.9 seconds")
            }

            R.id.mvd_agusta_f4_rc -> {
                motoName?.text = getString(R.string.mvd_agusta_f4_rc)
                motoDetails?.text = getString(R.string.motorcycle_details, "MV Agusta's limited edition superbike with a 998cc inline-four engine and exotic materials.")
                motoPerformance?.text = getString(R.string.motocycle_performance, "Top speed: 190 mph and 0-60 mph: 3.1 seconds")
            }

            R.id.yamaha_yzf_r1m -> {
                motoName?.text = getString(R.string.yamaha_yzf_r1m)
                motoDetails?.text = getString(R.string.motorcycle_details, "Yamaha's advanced superbike with a 998cc inline-four engine and electronic racing suspension.")
                motoPerformance?.text = getString(R.string.motocycle_performance, "Top speed: 186 mph and 0-60 mph: 2.7 seconds")
            }

            R.id.honda_cbr1000rr_r_fireblade_sp -> {
                motoName?.text = getString(R.string.honda_cbr1000rr_r_fireblade_sp)
                motoDetails?.text = getString(R.string.motorcycle_details, "Honda's high-performance superbike with a 999cc inline-four engine and advanced aerodynamics.")
                motoPerformance?.text = getString(R.string.motocycle_performance, "Top speed: 186 mph and 0-60 mph: 2.9 seconds")
            }

            R.id.suzuki_gsx_r1000r -> {
                motoName?.text = getString(R.string.suzuki_gsx_r1000r)
                motoDetails?.text = getString(R.string.motorcycle_details, "Suzuki's flagship superbike with a 999cc inline-four engine and advanced traction control.")
                motoPerformance?.text = getString(R.string.motocycle_performance, "Top speed: 186 mph and 0-60 mph: 2.9 seconds")
            }

            R.id.ktm_1290_super_duke_r -> {
                motoName?.text = getString(R.string.ktm_1290_super_duke_r)
                motoDetails?.text = getString(R.string.motorcycle_details, "KTM's powerful naked bike with a 1301cc V-twin engine and aggressive styling.")
                motoPerformance?.text = getString(R.string.motocycle_performance, "Top speed: 174 mph and 0-60 mph: 2.6 seconds")
            }

            R.id.ducati_streetfighter_v4 -> {
                motoName?.text = getString(R.string.ducati_streetfighter_v4)
                motoDetails?.text = getString(R.string.motorcycle_details, "Ducati's high-performance naked bike with a 1103cc V4 engine and advanced electronics.")
                motoPerformance?.text = getString(R.string.motocycle_performance, "Top speed: 180 mph and 0-60 mph: 2.9 seconds")
            }

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val motorcycleId = arguments?.getInt(MotorcycleDetailFragment.MOTORCYCLE_ID, 0) ?: 0
        setMotorcycleDetails(motorcycleId)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MotorcycleDetailFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MotorcycleDetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }

        private const val MOTORCYCLE_ID = "MOTORCYCLE_ID"

        fun newInstance(motorcycleId: Int) = MotorcycleDetailFragment().apply {
            arguments = Bundle().apply {
                putInt(MOTORCYCLE_ID, motorcycleId)
            }
        }
    }
}