package com.bookmanager.backend.repositories;

import com.bookmanager.backend.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
}
