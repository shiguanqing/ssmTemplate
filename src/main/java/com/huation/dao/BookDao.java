package com.huation.dao;

import com.huation.entry.Book;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    List<Book> queryAll();

    void addBook(@Param("pojo") Book pojo);
}
