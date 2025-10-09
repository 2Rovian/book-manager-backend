package com.bookmanager.backend.repositories;

import com.bookmanager.backend.dtos.response.BookResponseDto;
import com.bookmanager.backend.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
    List<BookResponseDto> findBookByNameContaining(String name);
}
