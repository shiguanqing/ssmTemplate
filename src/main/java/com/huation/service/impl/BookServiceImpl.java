package com.huation.service.impl;

import com.huation.dao.BookDao;
import com.huation.entry.Book;
import com.huation.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public Book queryById(long id) {
        return null;
    }

    public List<Book> queryAll() {
        return bookDao.queryAll();
    }

    public void saveBook(Book book) {
        bookDao.addBook(book);
    }
}
