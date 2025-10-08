package com.bookmanager.backend.repositories;

import com.bookmanager.backend.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
