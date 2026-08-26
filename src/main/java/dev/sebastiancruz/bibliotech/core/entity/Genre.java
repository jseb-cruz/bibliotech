package dev.sebastiancruz.bibliotech.core.entity;

import java.util.UUID;

public record Genre(
        UUID genreId,
        String name
) {
    public Genre(UUID genreId, String name) {
        if (genreId == null) {
            throw new IllegalArgumentException("El id del genero no puede ser nulo");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("El nombre del genero no puede ser nulo o vacio");
        }
        this.genreId = genreId;
        this.name = name;
    }

}
