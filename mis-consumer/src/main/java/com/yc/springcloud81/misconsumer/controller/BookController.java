package com.yc.springcloud81.misconsumer.controller;

import com.yc.springcloud81.misconsumer.bean.Book;
import com.yc.springcloud81.misconsumer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("book/{id}") //http://localhost:9999/consumer/book/id
    public Book getBook(@PathVariable("id") Integer id){
        return this.bookService.getBook(id);
    }


}
