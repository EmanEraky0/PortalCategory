package com.example.portalcategory.utils

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.portalcategory.R

fun Fragment.showMessage(message: String) =
    Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()

fun Context.stringOther() = getString(R.string.other)