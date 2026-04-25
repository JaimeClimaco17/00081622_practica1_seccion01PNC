package com.example.labo01.repositories;

import com.example.labo01.common.PokemonList;
import com.example.labo01.domain.model.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PokemonRepository {

    private final PokemonList listaPokemons;

    public List<Pokemon> findAll() {
        return listaPokemons.getPokemons();
    }
}