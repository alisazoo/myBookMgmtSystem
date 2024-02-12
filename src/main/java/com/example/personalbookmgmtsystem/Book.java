package com.example.personalbookmgmtsystem;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.util.Date;
import java.util.List;

@Value
@RequiredArgsConstructor
public class Book {

    private String id;
    private String title;
    private String subtitle;
    private String isbn13;
//    private List<Author> authors;
//    private String description;
//    private String publisher;
//    private Date publishing_date;
//    private int page_count;


}
