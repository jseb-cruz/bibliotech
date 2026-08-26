package dev.sebastiancruz.bibliotech;

import dev.sebastiancruz.bibliotech.core.constant.BookFormat;
import dev.sebastiancruz.bibliotech.core.entity.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        Book book = new Book(
                UUID.randomUUID(),
                "La Odisea",
                UUID.randomUUID(),
                UUID.randomUUID(),
                BookFormat.FORMAT_PHYSICAL,
                1
        );
        SpringApplication.run(Application.class, args);
    }
}

