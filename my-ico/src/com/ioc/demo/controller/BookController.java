package com.ioc.demo.controller;

import com.ioc.demo.service.BookService;

import org.vincent.springframework.ioc.annotation.Autowired;
import org.vincent.springframework.ioc.annotation.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;


}
