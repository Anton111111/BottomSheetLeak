package com.example.anton111111

import android.content.Context
import android.view.LayoutInflater
import com.example.anton111111.databinding.MyBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MyBottomSheetDialog(context: Context) : BottomSheetDialog(context) {
    private var _viewBinding: MyBottomSheetBinding? = null
    private val viewBinding get() = _viewBinding!!

    init {
        _viewBinding = MyBottomSheetBinding
            .inflate(LayoutInflater.from(context), null, false)
        setContentView(viewBinding.root)
        viewBinding.closeBtn.setOnClickListener {
            dismiss()
        }
    }

}