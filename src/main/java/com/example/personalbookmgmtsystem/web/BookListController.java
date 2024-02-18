package com.example.personalbookmgmtsystem.web;

import com.example.personalbookmgmtsystem.Book;
import com.example.personalbookmgmtsystem.data.BookRepository;
import com.example.personalbookmgmtsystem.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/booklist")
@SessionAttributes("books")
public class BookListController {
    BookService bookService;
    @ModelAttribute("books")
    public List<Book> addBooksToModel(Model model){
        // Get the list of books from the model
        List<Book> books = bookService.getAllBooks();
        if(books == null || books.isEmpty()){
            System.out.println("books is empty!");
            books = Arrays.asList(
                new Book(1L, "title1", "subtitle1", "1234567890123"),
                new Book(2L, "title2", "subtitle2", "2234567890123")
            );
        }
        System.out.println("list: " + books);
        return books;
    }

    @GetMapping
    public String showBookList(){
        return "booklist";
    }

}
