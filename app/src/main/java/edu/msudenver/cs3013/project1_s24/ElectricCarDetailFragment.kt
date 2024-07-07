package edu.msudenver.cs3013.project1_s24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ElectricCarDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ElectricCarDetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private val carName: TextView?
        get() = view?.findViewById(R.id.electric_car_name)
    private val carDetails: TextView?
        get() = view?.findViewById(R.id.electric_car_details)
    private val carPerformance: TextView?
        get() = view?.findViewById(R.id.electric_car_performance)

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
        return inflater.inflate(R.layout.fragment_electric_car_detail, container, false)
    }

    fun setElectricCarDetails(electriccarId: Int) {
        when (electriccarId) {
            R.id.tesla_model_s_plaid -> {
                carName?.text = getString(R.string.tesla_model_s_plaid)
                carDetails?.text = getString(R.string.car_details, "High-performance version of Tesla's flagship sedan with three motors and minimalist interior")
                carPerformance?.text = getString(R.string.car_performance, "Top speed: 200 mph and 0-60 mph: 1.99 seconds")
            }
            R.id.rimac_nevera -> {
                carName?.text = getString(R.string.rimac_nevera)
                carDetails?.text = getString(R.string.car_details, "Croatian hypercar with four electric motors, carbon fiber monocoque, and active aerodynamics")
                carPerformance?.text = getString(R.string.car_performance, "Top speed: 258 mph and 0-60 mph: 1.85 seconds")
            }

            R.id.aspark_owl -> {
                carName?.text = getString(R.string.aspark_owl)
                carDetails?.text = getString(R.string.car_details, "Japanese all-electric hypercar with a carbon fiber body and four electric motors.")
                carPerformance?.text = getString(R.string.car_performance, "Top speed: 249 mph and 0-60 mph: 1.69 seconds")
            }

            R.id.lotus_evija -> {
                carName?.text = getString(R.string.lotus_evija)
                carDetails?.text = getString(R.string.car_details, "British all-electric hypercar with a distinctive aerodynamic design and four-wheel drive.")
                carPerformance?.text = getString(R.string.car_performance, "Top speed: 217 mph and 0-60 mph: Under 3 seconds")
            }

            R.id.pininfarina_battista -> {
                carName?.text = getString(R.string.pininfarina_beretta)
                carDetails?.text = getString(R.string.car_details, "Italian luxury electric hyper GT designed by Pininfarina with four motors and a T-shaped battery pack.")
                carPerformance?.text = getString(R.string.car_performance, "Top speed: 217 mph and 0-60 mph: 1.9 seconds")
            }

            R.id.tesla_roadster -> {
                carName?.text = getString(R.string.tesla_roadster)
                carDetails?.text = getString(R.string.car_details, "Upcoming all-electric sports car from Tesla with a removable glass roof and seating for four.")
                carPerformance?.text = getString(R.string.car_performance, "Top speed: Over 250 mph (claimed) and 0-60 mph: 1.9 seconds (claimed)")
            }

            R.id.rimac_concept_one -> {
                carName?.text = getString(R.string.rimac_concept_one)
                carDetails?.text = getString(R.string.car_details, "Croatian electric hypercar with four electric motors, one for each wheel, and advanced torque vectoring.")
                carPerformance?.text = getString(R.string.car_performance, "Top speed: 221 mph and 0-60 mph: 2.5 seconds")
            }

            R.id.nio_ep9 -> {
                carName?.text = getString(R.string.nio_ep9)
                carDetails?.text = getString(R.string.car_details, "Electric supercar developed by Chinese manufacturer Nio, featuring active suspension and four individual gearboxes.")
                carPerformance?.text = getString(R.string.car_performance, "Top speed: 194 mph and 0-60 mph: 2.7 seconds")
            }

            R.id.porsche_taycan_turbo_s -> {
                carName?.text = getString(R.string.porsche_taycan_turbo_s)
                carDetails?.text = getString(R.string.car_details, "All-electric sports sedan from Porsche with dual motors and an 800-volt electrical system.")
                carPerformance?.text = getString(R.string.car_performance, "Top speed: 161 mph and 0-60 mph: 2.6 seconds")
            }

            R.id.tesla_model_s_performance -> {
                carName?.text = getString(R.string.tesla_model_s_performance)
                carDetails?.text = getString(R.string.car_details, "High-performance version of Tesla's luxury sedan with dual motor all-wheel drive and advanced autopilot capabilities.")
                carPerformance?.text = getString(R.string.car_performance, "Top speed: 163 mph and 0-60 mph: 3.1 seconds")
            }

            else -> {
                Toast.makeText(context, "Electric car details not found.", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val electriccarId = arguments?.getInt(ELECTRIC_CAR_ID, 0) ?: 0
        setElectricCarDetails(electriccarId)
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ElectricCarDetailFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ElectricCarDetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
        private const val ELECTRIC_CAR_ID = "ELECTRIC_CAR_ID"

        fun newInstance(electriccarId: Int) = ElectricCarDetailFragment().apply {
            arguments = Bundle().apply {
                putInt(ELECTRIC_CAR_ID, electriccarId)
            }
        }

    }
}