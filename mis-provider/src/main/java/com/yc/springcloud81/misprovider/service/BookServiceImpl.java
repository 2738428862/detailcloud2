package com.yc.springcloud81.misprovider.service;

import com.yc.springcloud81.misprovider.bean.Book;
import com.yc.springcloud81.misprovider.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
    @Autowired(required = false)
    private BookMapper bookMapper;

    public Book getBook(Integer id){
        //根据主键查  key
        return bookMapper.selectByPrimaryKey(id);
    }
}
