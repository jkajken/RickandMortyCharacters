package com.example.rickandmortycharacters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rickandmortycharacters.databinding.FragmentAllCharactersBinding


class AllCharactersFragment : Fragment() {
    private lateinit var binding: FragmentAllCharactersBinding
    private lateinit var characterList: ArrayList<Character>
    private var bundle = Bundle()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAllCharactersBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = Adapter(characterList, this::onClick)
        binding.RecyclerView.adapter = adapter
    }

    private fun onClick(position: Int) {

        bundle.putSerializable("KEY", characterList[position])
        findNavController().navigate(R.id.characterFragment, bundle)
    }

    private fun loadData() {
        characterList = ArrayList()
        characterList.add(Character("Rick Sanchez", R.drawable.ricksanchez, "Alive"))
        characterList.add(Character("Morty Smith", R.drawable.mortysmith, "Alive"))
        characterList.add(Character("Albert Einstein", R.drawable.alberteinstein, "Dead"))
        characterList.add(Character("Jerry Smith", R.drawable.jerrysmith, "Alive"))
        characterList.add(Character("Leonard Smith", R.drawable.leonardsmith, "Alive"))
        characterList.add(Character("Tammy Gutermann", R.drawable.tammygutermann, "Dead"))
        characterList.add(Character("Summer Smith", R.drawable.summersmith, "Alive"))
        characterList.add(Character("Sleepy Gary", R.drawable.sleepygary, "Alive"))
        characterList.add(Character("Scroopy", R.drawable.scroopy, "Dead"))
        characterList.add(Character("Bet Smith", R.drawable.betsmith, "Alive"))

    }


}