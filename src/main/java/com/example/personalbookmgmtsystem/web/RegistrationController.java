package com.example.personalbookmgmtsystem.web;

import com.example.personalbookmgmtsystem.Book;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/register")
@SessionAttributes("books")
public class RegistrationController {

    @GetMapping
    public String showRegistrationForm(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "registration";
    }

    @PostMapping
    public String submitForm(@ModelAttribute("book") Book book, Model model){
        // create a new Book instance contains the user input of the new book
        Book bookToAdd = new Book(
                1000L,
                book.getTitle(),
                book.getSubtitle(),
                book.getIsbn13()
        );

        // Get the current list of books from the model
        List<Book> books = (List<Book>) model.getAttribute("books");
        System.out.println("list: " + books);
        if(books == null || books.isEmpty()){
            System.out.println("books is empty!");
            books = new ArrayList<>();
        }

        // Add the new book to the list
        books.add(bookToAdd);

        // Add the updated list back to the model
        model.addAttribute("books", books);

        return "booklist";
    }
}
