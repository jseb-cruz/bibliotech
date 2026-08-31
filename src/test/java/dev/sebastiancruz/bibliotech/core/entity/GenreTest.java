package dev.sebastiancruz.bibliotech.core.entity;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GenreTest {
    private final UUID mockId = UUID.randomUUID();

    @Test
    void ShouldCreateGenreWithValidData(){
        Genre genre = new Genre(mockId, "Science Fiction");

        assert genre.genreId().equals(mockId);
        assert genre.name().equals("Science Fiction");
    }

    @Test
    void ShouldRejectNullId(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException
                .class,() -> new Genre(
                        null,
                        "Science Fiction"
                )
        );
        assert exception.getMessage().equals("El id del genero no puede ser nulo");
    }

    @Test
    void ShouldRejectNullName(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException
                .class,() -> new Genre(
                        mockId,
                        null
                )
        );
        assertEquals("El nombre del genero no puede ser nulo o vacio",
                exception.getMessage());

    }

    @Test
    void ShouldRejectBlankName(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException
                .class,() -> new Genre(
                        mockId,
                        "   "
                )
        );
        assertEquals("El nombre del genero no puede ser nulo o vacio",
                exception.getMessage());


    }
}
