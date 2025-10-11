package com.bookmanager.backend.repositories;

import com.bookmanager.backend.dtos.response.AuthorResponseDto;
import com.bookmanager.backend.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
    List<AuthorResponseDto> findAuthorByFirstNameContaining(String firstName);
    List<AuthorResponseDto> findAuthorByLastNameContaining(String lastName);
}
