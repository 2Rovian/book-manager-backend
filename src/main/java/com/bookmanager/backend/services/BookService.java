package com.bookmanager.backend.services;

import com.bookmanager.backend.dtos.request.BookRequestDto;
import com.bookmanager.backend.dtos.response.BookResponseDto;
import com.bookmanager.backend.entities.AuthorEntity;
import com.bookmanager.backend.entities.BookEntity;
import com.bookmanager.backend.repositories.AuthorRepository;
import com.bookmanager.backend.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public List<BookResponseDto> getBooks(){
        return bookRepository.findAll()
                .stream()
                .map(book -> new BookResponseDto(book.getId(), book.getName(), book.getIsbn(), book.getAuthor()))
                .toList();
    }

    public BookEntity postBook(BookRequestDto book){
        AuthorEntity author = authorRepository.findById(book.authorId())
                .orElseThrow(() -> new RuntimeException("Author not found"));
        BookEntity newBook = new BookEntity();
        newBook.setName(book.name());
        newBook.setIsbn(book.isbn());
        newBook.setAuthor(author);
        return bookRepository.save(newBook);
    }

    public Optional<BookEntity> getBookById(Long id){
        return bookRepository.findById(id);
    }

    public String deleteBookById(Long id) {
        if(bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
            return "Livro deletado";
        }

        return "O livro de id " + id + " não existe";
    }
}
