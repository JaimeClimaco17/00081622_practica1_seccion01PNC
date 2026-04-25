package com.example.labo01.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Pokemon {
    private String nombre;
    private String tipo;
    private String debilidades;
    private String location;
    private String region;
}
