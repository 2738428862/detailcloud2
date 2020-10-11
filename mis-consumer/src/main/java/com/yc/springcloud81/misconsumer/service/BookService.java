package com.yc.springcloud81.misconsumer.service;

import com.yc.springcloud81.misconsumer.bean.Book;

public interface BookService {
    /*
    在消费端以   Rest 形式(socket ,HttpClient,RestTemplate ,...)去访问  provider的服务
     */
    public Book getBook(int id);
}
