package org.d3ifcool4075.praass


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import org.d3ifcool4075.praass.databinding.FragmentMainBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class main : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentMainBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_main, container, false)

        binding.persegiPanjang.setOnClickListener {
            it.findNavController().navigate(R.id.action_main_to_persegiPanjang)
        }
        binding.segitiga.setOnClickListener {
            it.findNavController().navigate(R.id.action_main_to_segitiga2)
        }
        return binding.root
    }


}
