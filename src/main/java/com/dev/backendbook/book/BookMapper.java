package com.dev.backendbook.book;

import org.springframework.stereotype.Service;

import static com.dev.backendbook.book.Book.*;

// convierto bookrequest en un objeto book
@Service
public class BookMapper {

    public Book toBook(BookRequest request) {
        return builder() // utilizo el patron builder para crear una instancia de book con los datos de bookrequest
                .id(request.id())
                .title(request.title())
                .isbn(request.isbn())
                .authorName(request.authorName())
                .synopsis(request.synopsis())
                .archived(false)
                .shareable(request.shareable())
                .build();
    }
    
    

}
