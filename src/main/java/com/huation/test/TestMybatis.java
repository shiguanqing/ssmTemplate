package com.huation.test;

import com.huation.dao.BookDao;
import com.huation.entry.Book;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis
{
    @Test
    public void fun1() throws Exception {
        // load xml property file
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        // create SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        // create salSession
        SqlSession sqlSession = factory.openSession();

        // get proxy object
        BookDao bookDao = sqlSession.getMapper(BookDao.class);

        // query all books
        List<Book> books = bookDao.queryAll();
        for (Book book: books)
        {
            System.out.println(book);
        }

        // close resources
        sqlSession.close();

        in.close();

    }
}
