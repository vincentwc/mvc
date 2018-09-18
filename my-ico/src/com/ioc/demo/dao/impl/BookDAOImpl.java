package com.ioc.demo.dao.impl;

import com.ioc.demo.dao.BookDAO;

import org.vincent.springframework.ioc.annotation.Repository;

@Repository("bookDao")
public class BookDAOImpl implements BookDAO {

    @Override
    public void add() {
        System.out.println("新增图书信息");
    }
}
