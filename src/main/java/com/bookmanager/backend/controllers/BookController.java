package com.bookmanager.backend.controllers;
import com.bookmanager.backend.dtos.request.BookRequestDto;
import com.bookmanager.backend.dtos.response.BookResponseDto;
import com.bookmanager.backend.entities.BookEntity;
import com.bookmanager.backend.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<BookResponseDto>> getBooks(){
        return ResponseEntity.ok(bookService.getBooks());
    }

    @PostMapping
    public ResponseEntity<BookEntity> postBook(@RequestBody BookRequestDto book){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.postBook(book));
    }
}
