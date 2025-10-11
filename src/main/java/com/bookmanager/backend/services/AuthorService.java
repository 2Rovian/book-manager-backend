package com.bookmanager.backend.services;

import com.bookmanager.backend.dtos.request.AuthorRequestDto;
import com.bookmanager.backend.dtos.response.AuthorResponseDto;
import com.bookmanager.backend.entities.AuthorEntity;
import com.bookmanager.backend.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<AuthorResponseDto> getAuthors() {
        return authorRepository.findAll()
                .stream()
                .map(author -> new AuthorResponseDto(author.getId(), author.getFirstName(), author.getLastName()))
                .toList();
    }
    
    public Optional<AuthorEntity> getAuthorById(Long id){
        return authorRepository.findById(id);
    }

    public List<AuthorResponseDto> getAuthorByFirstName(String firstName) {
        return authorRepository.findAuthorByFirstNameContaining(firstName);
    }

    public List<AuthorResponseDto> getAuthorByLastName(String lastName) {
        return authorRepository.findAuthorByLastNameContaining(lastName);
    }

    public AuthorEntity postAuthor(AuthorRequestDto author){
        var newAuthor = new AuthorEntity();
        newAuthor.setFirstName(author.firstName());
        newAuthor.setLastName(author.lastName());
        return authorRepository.save(newAuthor);
    }
}
