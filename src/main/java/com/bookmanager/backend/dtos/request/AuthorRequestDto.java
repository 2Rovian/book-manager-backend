package com.bookmanager.backend.dtos.request;

import com.bookmanager.backend.entities.AuthorEntity;
import com.bookmanager.backend.entities.BookEntity;

import java.util.Set;

public record AuthorRequestDto(String firstName, String lastName, Set<BookEntity> books) {
}
