package com.bookmanager.backend.dtos.response;
import com.bookmanager.backend.entities.BookEntity;
import java.util.Set;

public record AuthorResponseDto(Long id, String firstName, String lastName, Set<BookEntity> books) {
}
