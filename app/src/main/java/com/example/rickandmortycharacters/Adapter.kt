package com.example.rickandmortycharacters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmortycharacters.databinding.ItemCharactersBinding

class Adapter(
    private val characterList: ArrayList<Character>,
    private val onClick: (position: Int) -> Unit,
)
    : RecyclerView.Adapter<Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCharactersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener{
            onClick(position)}
        holder.bind(characterList[position])
    }

    override fun getItemCount() = characterList.size

   inner class ViewHolder(private var binding: ItemCharactersBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(character: Character) {
            binding.apply {
                characterImgV.setImageResource(character.characterImage)
                nameTextV.text = character.characterName
                doraTextV.text=character.characterAliveOrDead

            }
        }
    }
}