package tech.pucci.digivice.presenter.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import tech.pucci.digivice.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private val viewModel: ListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentListBinding.inflate(inflater, container, false).run {
            observeDigimon(tvName)
            root
        }
    }

    fun observeDigimon(tvName: TextView) {
        viewModel.digimon.observe(viewLifecycleOwner) {
            tvName.text = it[0].name
        }
    }
}
