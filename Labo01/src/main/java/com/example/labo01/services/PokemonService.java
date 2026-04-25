package com.example.labo01.services;

import com.example.labo01.domain.model.Pokemon;
import com.example.labo01.repositories.PokemonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public List<Pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }

    public List<Pokemon> filtrarPorTipo(String tipo) {
        return pokemonRepository.findAll().stream()
                .filter(p -> p.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filtrarPorZona(String zona) {
        return pokemonRepository.findAll().stream()
                .filter(p -> p.getLocation().equalsIgnoreCase(zona))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filtrarPorDebilidad(String debilidad) {
        return pokemonRepository.findAll().stream()
                .filter(p -> {
                    String[] debs = p.getDebilidades().split(",");
                    for (String d : debs) {
                        if (d.trim().equalsIgnoreCase(debilidad)) {
                            return true;
                        }
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }
}