package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class CalculateArea : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_calculate_area,container,false)
        val cirle_btn : Button = view.findViewById(R.id.circle_Area_button)
        val rectangle_btn : Button = view.findViewById(R.id.rectangle_Area_button)

        cirle_btn.setOnClickListener{
            val fragment1 = FirstFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container,fragment1)?.commit()
        }

        rectangle_btn.setOnClickListener{
            val fragment2 = SecondFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container,fragment2)?.commit()
        }
        return view
    }
}