package com.bookmanager.backend.dtos.request;

import com.bookmanager.backend.entities.AuthorEntity;

public record BookRequestDto(String name, String isbn, AuthorEntity author) {
}
