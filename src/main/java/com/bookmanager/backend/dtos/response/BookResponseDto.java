package com.bookmanager.backend.dtos.response;

import com.bookmanager.backend.entities.AuthorEntity;

public record BookResponseDto(Long id, String name, String isbn, AuthorEntity author) {
}
