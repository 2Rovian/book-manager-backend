package com.bookmanager.backend.controllers;

import com.bookmanager.backend.dtos.request.AuthorRequestDto;
import com.bookmanager.backend.dtos.response.AuthorResponseDto;
import com.bookmanager.backend.entities.AuthorEntity;
import com.bookmanager.backend.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity<List<AuthorResponseDto>> getAuthors(
            @RequestParam(required = false, name = "firstName") String firstName,
            @RequestParam(required = false, name = "lastName") String lastName)
    {
        if (firstName != null && !firstName.isEmpty()) {
            return ResponseEntity.ok(authorService.getAuthorByFirstName(firstName));
        }
        if (lastName != null && !lastName.isEmpty()) {
            return ResponseEntity.ok(authorService.getAuthorByLastName(lastName));
        }

        return ResponseEntity.ok(authorService.getAuthors());
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{id}")
    public ResponseEntity<Optional<AuthorEntity>> getAuthorById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(authorService.getAuthorById(id));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<AuthorEntity> postAuthor(@RequestBody AuthorRequestDto author){
        return ResponseEntity.status(HttpStatus.CREATED).body(authorService.postAuthor(author));
    }
}
