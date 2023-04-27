package com.example.laboratorio05.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio05.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ragment_movie_container : Fragment() {
private lateinit var button: FloatingActionButton
private lateinit var recyclerViewModel: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie_container, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        button.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragment_movie_container_to_fragment_new_movie)
        }
    }

    private fun bind() {
        button = view?.findViewById(R.id.add_action6) as FloatingActionButton
    }


}