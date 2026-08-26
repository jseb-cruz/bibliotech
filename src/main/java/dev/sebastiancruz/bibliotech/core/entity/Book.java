package dev.sebastiancruz.bibliotech.core.entity;

import java.util.UUID;
import dev.sebastiancruz.bibliotech.core.constant.BookFormat;


public record Book (
    UUID id,
    String title,
    UUID authorId,
    UUID genreId,
    BookFormat format,
    int quantity
){
    public Book(UUID id, String title, UUID authorId, UUID genreId, BookFormat format, int quantity) {
        if(id == null){
            throw new IllegalArgumentException("El id del libro no puede ser nulo");
        }
        if(title== null || title.isBlank()){
            throw new IllegalArgumentException("El titulo del libro no puede ser nulo o vacio");
        }
        if(authorId == null){
            throw new IllegalArgumentException("El id del autor del libro no puede ser nulo");
        }
        if(genreId == null){
            throw new IllegalArgumentException("El id del genero no puede ser nulo");
        }
        if(format == null){
            throw new IllegalArgumentException("El formato no puede ser nulo");
        }
        if(quantity <= 0){
            throw new IllegalArgumentException("La cantidad del libro tiene que ser mayor a 0");
        }
        this.id = id;
        this.title = title;
        this.authorId = authorId;
        this.genreId = genreId;
        this.format = format;
        this.quantity = quantity;

    }
}

