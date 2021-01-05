package com.example.anton111111

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.anton111111.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _viewBinding: FragmentMainBinding? = null
    private val viewBinding get() = _viewBinding!!
    private lateinit var bottomSheet: MyBottomSheetDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _viewBinding = FragmentMainBinding.inflate(layoutInflater, container, false)
        bottomSheet = MyBottomSheetDialog(requireContext())
        viewBinding.showBtn.setOnClickListener {
            bottomSheet.show()
        }
        return viewBinding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _viewBinding = null
    }
}