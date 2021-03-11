package de.jensklingenberg.basickmm.androidApp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import de.jensklingenberg.basickmm.shared.Greeting



class MainFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.activity_main, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().findViewById<RecyclerView>(R.id.recycler).apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ListAdapter(Greeting().getnicCageMovies())
        }
        requireActivity().findViewById<TextView>(R.id.platform).setText( Greeting().greeting())
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }
}