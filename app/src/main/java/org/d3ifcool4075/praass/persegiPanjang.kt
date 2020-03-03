package org.d3ifcool4075.praass


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import kotlinx.android.synthetic.main.fragment_persegi_panjang.view.*
import org.d3ifcool4075.praass.databinding.FragmentPersegiPanjangBinding
import org.d3ifcool4075.praass.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class persegiPanjang : Fragment() {
    private var hitungLuas = 0.0
    private var hitungKeliling = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPersegiPanjangBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_persegi_panjang, container, false)

        binding.hitungPp.setOnClickListener {
            val panjang = binding.panjangPp.text.toString().toDouble()
            val lebar = binding.lebarPp.text.toString().toDouble()

            hitungLuas = panjang * lebar
            binding.luasPp.text = "$hitungLuas"

            hitungKeliling = panjang + lebar
            binding.kelilingPp.text = "$hitungKeliling"
        }

        binding.sharePp.setOnClickListener {
            startActivity(shareHasil())
        }

        return binding.root
    }

    private fun shareHasil(): Intent {
        return ShareCompat.IntentBuilder.from(activity!!)
            .setText(getString(R.string.shareText,hitungLuas.toString(),hitungKeliling.toString()))
            .setType("text/plain").intent
    }


}
