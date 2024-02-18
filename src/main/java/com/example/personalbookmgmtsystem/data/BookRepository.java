package com.example.personalbookmgmtsystem.data;

import com.example.personalbookmgmtsystem.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
