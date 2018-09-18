package com.ioc.demo.service.impl;

import com.ioc.demo.dao.BookDAO;
import com.ioc.demo.service.BookService;

import org.vincent.springframework.ioc.annotation.Autowired;
import org.vincent.springframework.ioc.annotation.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Override
    public void persist() {
        bookDAO.add();
    }
}
