package dev.sebastiancruz.bibliotech.core.entity;

import dev.sebastiancruz.bibliotech.core.constant.BookFormat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.UUID;

public class BookTest {
    private final UUID mockId = UUID.randomUUID();
    private final UUID mockAuthorId = UUID.randomUUID();
    private final UUID mockGenreId = UUID.randomUUID();
    private final BookFormat mockFormat = BookFormat.FORMAT_PHYSICAL;

    @Test
    void ShouldCreateBookWithValidData(){
        Book book = new Book(mockId, "Clean code", mockAuthorId, mockGenreId, mockFormat, 10);

        assertEquals(mockId, book.id());
        assertEquals("Clean code", book.title());
        assertEquals(mockAuthorId, book.authorId());
        assertEquals(mockGenreId, book.genreId());
        assertEquals(mockFormat, book.format());
        assertEquals(10, book.quantity());
    }

    @Test
    void ShouldRejectNullId(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException
                .class,() -> new Book(
                        null,
                        "Clean code",
                        mockAuthorId,
                        mockGenreId,
                        mockFormat,
                        10
                )
        );
        assertEquals("El id del libro no puede ser nulo",
                exception.getMessage()
        );
    }

    @Test
    void ShouldRejectNullTitle(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException
                .class,() -> new Book(
                        mockId,
                        null,
                        mockAuthorId,
                        mockGenreId,
                        mockFormat,
                        10
                )
        );
        assertEquals("El titulo del libro no puede ser nulo o vacio",
                exception.getMessage()
        );
    }
    @Test
    void ShouldRejectBlankTitle(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException
                .class,() -> new Book(
                        mockId,
                        "   ",
                        mockAuthorId,
                        mockGenreId,
                        mockFormat,
                        10
                )
        );
        assertEquals("El titulo del libro no puede ser nulo o vacio",
                exception.getMessage()
        );
    }

    @Test
    void ShouldRejectNullAuthorId(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException
                .class,() -> new Book(
                        mockId,
                        "Clean code",
                        null,
                        mockGenreId,
                        mockFormat,
                        10
                )
        );
        assertEquals("El id del autor del libro no puede ser nulo",
                exception.getMessage()
        );
    }

    @Test
    void ShouldRejectNullGenreId(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException
                .class,() -> new Book(
                        mockId,
                        "Clean code",
                        mockAuthorId,
                        null,
                        mockFormat,
                        10
                )
        );
        assertEquals("El id del genero no puede ser nulo",
                exception.getMessage()
        );
    }

    @Test
    void ShouldRejectNullFormat(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException
                .class,() -> new Book(
                        mockId,
                        "Clean code",
                        mockAuthorId,
                        mockGenreId,
                        null,
                        10
                )
        );
        assertEquals("El formato no puede ser nulo",
                exception.getMessage()
        );
    }

    @Test
    void ShouldRejectNullQuantity(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException
                .class,() -> new Book(
                        mockId,
                        "Clean code",
                        mockAuthorId,
                        mockGenreId,
                        mockFormat,
                        0
                )
        );
        assertEquals("La cantidad del libro tiene que ser mayor a 0",
                exception.getMessage()
        );
    }
}

