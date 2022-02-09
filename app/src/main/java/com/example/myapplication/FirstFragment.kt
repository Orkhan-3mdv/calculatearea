package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private var _binding:FragmentFirstBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentFirstBinding.inflate(layoutInflater,container,false)
        return binding.root
    }



    fun calculate(value1:Int,value2:Int,Result:Int)
    {

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}