package com.example.labo01.common;

import com.example.labo01.domain.model.Pokemon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PokemonList {
    private final List<Pokemon> pokemons;

    public PokemonList() {
        this.pokemons = new ArrayList<>();

        this.pokemons.add(Pokemon.builder()
                .nombre("Charmander")
                .tipo("Fuego")
                .debilidades("Agua, Roca, Tierra")
                .location("Grass")
                .region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .nombre("Squirtle")
                .tipo("Agua")
                .debilidades("Electrico, Planta")
                .location("Grass")
                .region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .nombre("Pikachu")
                .tipo("Electrico")
                .debilidades("Tierra")
                .location("Forest")
                .region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .nombre("Metapod")
                .tipo("Bicho")
                .debilidades("Fuefo, Volador, Roca")
                .location("Forest")
                .region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .nombre("Charmeleon")
                .tipo("Fuego")
                .debilidades("Agua, Roca, Tierra")
                .location("Grass")
                .region("Kanto")
                .build());
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}