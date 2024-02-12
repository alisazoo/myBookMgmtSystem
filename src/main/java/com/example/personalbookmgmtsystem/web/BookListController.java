package com.example.personalbookmgmtsystem.web;

import com.example.personalbookmgmtsystem.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/booklist")
//@SessionAttributes("books")
public class BookListController {
    @ModelAttribute("books")
    public List<Book> addBooksToModel(Model model){
        List<Book> books = Arrays.asList(
                new Book("demo1", "title1", "subtitle1", "1234567890123"),
                new Book("demo2", "title2", "subtitle2", "2234567890123")
        );
        return books;
    }

    @GetMapping
    public String showBookList(){
        return "booklist";
    }

}
