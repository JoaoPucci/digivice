package tech.pucci.digivice.presenter.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import tech.pucci.digivice.databinding.FragmentListBinding
import tech.pucci.digivice.presenter.list.adapter.DigimonAdapter

class ListFragment : Fragment() {

    private val viewModel: ListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentListBinding = FragmentListBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel

        observeDigimon(binding.rvDigimon.also { it.adapter = DigimonAdapter() })
        return binding.root
    }

    private fun observeDigimon(rvDigimon: RecyclerView) {
        viewModel.digimon.observe(viewLifecycleOwner) {
            (rvDigimon.adapter as DigimonAdapter).update(it)
        }
    }
}
