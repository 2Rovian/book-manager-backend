package com.bookmanager.backend.dtos.request;

public record BookRequestDto(String name, String isbn, Long authorId) {
}
