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
 * Use the [CombustionCarDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CombustionCarDetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    // These IDs should be defined according to your specific needs and should correspond to elements in your layout
    private val carName: TextView?
        get() = view?.findViewById(R.id.car_name)
    private val carDetails: TextView?
        get() = view?.findViewById(R.id.car_details)
    private val carPerformance: TextView?
        get() = view?.findViewById(R.id.car_performance)

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
        return inflater.inflate(R.layout.fragment_combustion_car_detail, container, false)
    }

    fun setCarDetails(carId: Int) {
        when (carId) {
            R.id.bugatti_chiron_ss -> {
                carName?.text = getString(R.string.bugatti_chiron_super_sport)
                carDetails?.text = getString(R.string.car_details,"Limited edition hypercar with a quad-turbocharged 8.0-liter W16 engine and extensively modified aerodynamics for top speed runs.")
                carPerformance?.text = getString(R.string.car_performance,"Horsepowers: 1000hp, Top speed: 304 mph" + " and 0-60 mph: 2.4 seconds")
            }
            R.id.bugatti_veyron_ss-> {
                carName?.text = getString(R.string.bugatti_veyron_super_sport)
                carDetails?.text = getString(R.string.car_details,"Former world's fastest production car with a quad-turbocharged 8.0-liter W16 engine and all-wheel drive.")
                carPerformance?.text = getString(R.string.car_performance,"267 mph and 0-60 mph: 2.4 seconds")
            }
            R.id.koenigsegg_jesko -> {
                carName?.text = getString(R.string.koenigsegg_jesko_absolut)
                carDetails?.text = getString(R.string.car_details,"Swedish hypercar with a twin-turbo V8 engine, featuring a unique Light Speed Transmission and low-drag aerodynamics.")
                carPerformance?.text = getString(R.string.car_performance,"Top speed: 330 mph (theoretical) and 0-60 mph: 2.5 seconds")
            }

            R.id.hennessey_venom -> {
                carName?.text = getString(R.string.hennessey_venom_f5)
                carDetails?.text = getString(R.string.car_details,"American-built hypercar powered by a twin-turbocharged 6.6-liter V8 engine, aiming to break the 300 mph barrier.")
                carPerformance?.text = getString(R.string.car_performance,"Top speed: 311 mph (claimed) and 0-60 mph: 2.6 seconds")
            }

            R.id.ssc_tuatara -> {
                carName?.text = getString(R.string.ssc_tuatara)
                carDetails?.text = getString(R.string.car_details,"American-made hypercar with a twin-turbo V8 engine, featuring a carbon fiber body and active aerodynamics.")
                carPerformance?.text = getString(R.string.car_performance,"Top speed: 282.9 mph and 0-60 mph: 2.5 seconds")
            }

            R.id.porsche_918 -> {
                carName?.text = getString(R.string.porsche_918_spyder)
                carDetails?.text = getString(R.string.car_details,"Hybrid supercar from Porsche with a naturally aspirated V8 engine and two electric motors.")
                carPerformance?.text = getString(R.string.car_performance,"Top speed: 214 mph and 0-60 mph: 2.2 seconds")
            }

            R.id.ferrari_laferrari -> {
                carName?.text = getString(R.string.ferrari_laferrari)
                carDetails?.text = getString(R.string.car_details,"Limited production hybrid sports car by Ferrari, featuring a V12 engine combined with an electric motor.")
                carPerformance?.text = getString(R.string.car_performance,"Top speed: 217 mph and 0-60 mph: 2.4 seconds")
            }

            R.id.mclaren_p1 -> {
                carName?.text = getString(R.string.mclaren_p1)
                carDetails?.text = getString(R.string.car_details,"Limited production plug-in hybrid sports car by McLaren, with a twin-turbo V8 engine and an electric motor.")
                carPerformance?.text = getString(R.string.car_performance,"Top speed: 217 mph and 0-60 mph: 2.8 seconds")
            }

            R.id.lamborghini_aventador -> {
                carName?.text = getString(R.string.lamborghini_aventador_svj)
                carDetails?.text = getString(R.string.car_details,"High-performance version of the Aventador, featuring a naturally aspirated V12 engine and advanced aerodynamics.")
                carPerformance?.text = getString(R.string.car_performance,"Top speed: 217 mph and 0-60 mph: 2.8 seconds")
            }

            R.id.ferrari_laferrari -> {
                carName?.text = getString(R.string.ferrari_sf90_stradale)
                carDetails?.text = getString(R.string.car_details,"Ferrari's first plug-in hybrid sports car, combining a V8 engine with three electric motors.")
                carPerformance?.text = getString(R.string.car_performance,"Top speed: 211 mph and 0-60 mph: 2.5 seconds")
            }

            else -> {
                Toast.makeText(context, "Car details not found", Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val carId = arguments?.getInt(CAR_ID, 0) ?: 0
        setCarDetails(carId)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CombustionCarDetailFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CombustionCarDetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
        //private const val CAR_ID = "CAR_ID"

        fun newInstance(carId: Int) = CombustionCarDetailFragment().apply {
            arguments = Bundle().apply {
                putInt(CAR_ID, carId)
            }
        }

    }
}