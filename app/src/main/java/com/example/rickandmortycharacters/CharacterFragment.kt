package com.example.rickandmortycharacters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.rickandmortycharacters.databinding.FragmentCharacterBinding



class CharacterFragment : Fragment() {
    private lateinit var binding: FragmentCharacterBinding
    private lateinit var dataFromAllCharactersFragment: Character


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharacterBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataFromAllCharactersFragment = arguments?.getSerializable("KEY") as Character

        binding.apply {

            characterImage.setImageResource(dataFromAllCharactersFragment.characterImage)
            characterNameTextV.text=dataFromAllCharactersFragment.characterName
            }
    }
}