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
}