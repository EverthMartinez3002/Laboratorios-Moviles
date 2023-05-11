package com.example.laboratorio05.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

import com.example.laboratorio05.R
import com.example.laboratorio05.databinding.FragmentMovieBinding
import com.example.laboratorio05.databinding.FragmentNewMovieBinding

/**
 * A simple [Fragment] subclass.
 * Use the [movieFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class movieFragment : Fragment() {

    private lateinit var okButton: Button
    private lateinit var binding: FragmentMovieBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        okButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_movieFragment_to_billboardFragment)
        }




    }

    private fun bind(){
        okButton = view?.findViewById(R.id.ok_button) as Button

    }




}