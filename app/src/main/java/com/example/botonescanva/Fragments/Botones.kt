package com.example.botonescanva.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.botonescanva.R
import com.example.botonescanva.databinding.FragmentBotonesBinding

class Botones : Fragment() {

    private var _b:FragmentBotonesBinding? = null
    private val b get() = _b!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentBotonesBinding.inflate(inflater, container, false)
        return b.root
    }

}