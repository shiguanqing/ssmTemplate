package com.huation.test;

import com.huation.service.BookService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1()
    {
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        // 获取对象
        BookService bookService = (BookService)ac.getBean("bookServiceImpl");

        // 调用方法
        bookService.queryAll();

    }
}
