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
    private lateinit var navArgs: CharacterFragmentArgs


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharacterBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         arguments?.let {
            navArgs = CharacterFragmentArgs.fromBundle(it)
        }
        dataFromAllCharactersFragment=navArgs.rickandmorthy
        binding.apply {

            characterNameTextV.text= dataFromAllCharactersFragment.characterName
            characterImage.setImageResource(dataFromAllCharactersFragment.characterImage)
            }
    }
}

// arguments?.let {
//            navArgs= SecondFragmentArgs.fromBundle(it)
//        }
//        binding.tvResult.text=navArgs.toString()
//    }