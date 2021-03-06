package org.d3ifcool4075.praass


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3ifcool4075.praass.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class segitiga : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSegitigaBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_segitiga, container, false)

        binding.hitungS.setOnClickListener {
            val alas = binding.alasS.text.toString().toDouble()
            val tinggi = binding.tinggiS.text.toString().toDouble()

            val hitungL = alas * tinggi /2
            binding.luasS.text = "$hitungL"

            val hitungKel = alas * 3
            binding.kelilingS.text = "$hitungKel"
        }

        return binding.root
    }


}
