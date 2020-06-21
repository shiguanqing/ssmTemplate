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
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        // 创建salSession对象
        SqlSession sqlSession = factory.openSession();

        // 获取代理对象
        BookDao bookDao = sqlSession.getMapper(BookDao.class);

        // 查询所有数据
        List<Book> books = bookDao.queryAll();
        for (Book book: books)
        {
            System.out.println(book);
        }

        // 关闭资源
        sqlSession.close();

        in.close();

    }
}
