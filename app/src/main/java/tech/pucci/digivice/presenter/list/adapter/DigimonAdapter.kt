package tech.pucci.digivice.presenter.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import tech.pucci.digivice.data.model.Digimon
import tech.pucci.digivice.databinding.ListItemDigimonBinding

class DigimonAdapter(private val digimonList: MutableList<Digimon> = mutableListOf()) :
    RecyclerView.Adapter<DigimonAdapter.DigimonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DigimonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemDigimonBinding.inflate(inflater, parent, false)
        return DigimonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DigimonViewHolder, position: Int) {
        holder.bind(digimonList[position])
    }

    override fun getItemCount() = digimonList.count()

    inner class DigimonViewHolder(private val binding: ListItemDigimonBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(digimon: Digimon) {
            binding.digimon = digimon
        }
    }

    fun update(digimonList: List<Digimon>) {
        this.digimonList.removeAll { true }
        this.digimonList.addAll(digimonList)
        notifyDataSetChanged()
    }
}
