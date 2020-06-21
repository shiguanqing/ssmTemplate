package com.huation.dao;

import com.huation.entry.Book;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    /**
     * 查询所有图书
     * @return
     */
    List<Book> queryAll();


    /**
     * 添加书本
     * @param pojo
     */
    void addBook(@Param("pojo") Book pojo);
}
