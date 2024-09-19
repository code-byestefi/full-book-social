package com.dev.backendbook.book;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

// representa la estructura de datos para solicitar la creación o actualización de un libro.
public record BookRequest (
        Integer id,
        @NotNull(message = "100")
        @NotEmpty(message = "100")
        String title,
        @NotNull(message = "101")
        @NotEmpty(message = "101")
        String authorName,
        @NotNull(message = "102")
        @NotEmpty(message = "102")
        String isbn,
        boolean shareable,
        @NotNull(message = "103")
        @NotEmpty(message = "103")
        String synopsis

) {
}
