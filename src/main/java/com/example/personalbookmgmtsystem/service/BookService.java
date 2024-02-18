package com.example.personalbookmgmtsystem.service;

import com.example.personalbookmgmtsystem.Book;
import com.example.personalbookmgmtsystem.data.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    };

    public Book getBookById(Long id){
        return bookRepository.findById(id).orElse(null);
    }

//    List<Book> updateBook();
//
//    boolean deleteBook();
}