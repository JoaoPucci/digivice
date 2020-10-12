package tech.pucci.digivice.presenter.list

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import tech.pucci.digivice.R

class ListFragment : Fragment() {

    private val viewModel: ListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        observeDigimon()
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    fun observeDigimon() {
        viewModel.digimon.observe(viewLifecycleOwner) {
            Toast.makeText(context, it[0].name, Toast.LENGTH_LONG).show()
        }
    }
}
