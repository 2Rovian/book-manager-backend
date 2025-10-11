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
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity<List<BookResponseDto>> getBooks(@RequestParam(name = "name", required = false) String name){
        if (name != null && !name.isEmpty()) {
            return ResponseEntity.ok(bookService.getBookContainingName(name));
        }

        return ResponseEntity.ok(bookService.getBooks());
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<BookEntity> postBook(@RequestBody BookRequestDto book){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.postBook(book));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public ResponseEntity<ResponseEntity<?>> putBook(
            @RequestBody BookRequestDto book,
            @PathVariable(name = "id", required = true) Long id ){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.putBook(id, book));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{id}")
    public ResponseEntity<Optional<BookEntity>> getBookById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(bookService.getBookById(id));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public String deleteBookById(@PathVariable(name = "id") Long id){
        return bookService.deleteBookById(id);
    }
}
