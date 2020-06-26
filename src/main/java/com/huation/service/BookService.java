package com.huation.service;

import com.huation.entry.Book;

import java.util.List;

public interface BookService {
    /**
     * 根据图书Id查询图书
     * @param id
     * @return
     */
    Book queryById(long id);

    /**
     * 查询所有图书
     * @return
     */
    List<Book> queryAll();

    /**
     * 保存图书
     * @param book
     */
    void saveBook(Book book);
}
