package com.example.labo01;

import com.example.labo01.domain.model.Pokemon;
import com.example.labo01.services.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class Labo01Application implements CommandLineRunner {

    private final PokemonService pokemonService;

    public static void main(String[] args) {
        SpringApplication.run(Labo01Application.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("=== FILTRAR POR TIPO ===");
        imprimir(pokemonService.filtrarPorTipo("Fuego"));

        System.out.println("\n=== FILTRAR POR ZONA ===");
        imprimir(pokemonService.filtrarPorZona("Forest"));

        System.out.println("\n=== FILTRAR POR DEBILIDAD ===");
        imprimir(pokemonService.filtrarPorDebilidad("Tierra"));
    }

    private void imprimir(List<Pokemon> pokemones) {
        for (Pokemon p : pokemones) {
            System.out.println("[PKMN] Nombre: " + p.getNombre()
                    + " | Tipo: " + p.getTipo()
                    + " | Debilidades: " + p.getDebilidades());
        }
    }
}