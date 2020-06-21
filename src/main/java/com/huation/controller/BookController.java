package com.huation.controller;

import com.huation.entry.Book;
import com.huation.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/findAll")
    public String findAll(Model model)
    {
        List<Book> books = bookService.queryAll();
        model.addAttribute("list", books);

        return "list";
    }

    @RequestMapping("/save")
    public void save(Book book, HttpServletRequest request, HttpServletResponse response) throws IOException {
        bookService.saveBook(book);
        response.sendRedirect(request.getContextPath() + "/book/findAll");
    }
}
