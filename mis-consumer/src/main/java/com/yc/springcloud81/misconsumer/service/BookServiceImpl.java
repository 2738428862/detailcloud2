package com.yc.springcloud81.misconsumer.service;

import com.yc.springcloud81.misconsumer.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookServiceImpl implements  BookService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Book getBook(int id) {
        //http://application（就是localhost:9999）  服务名由ribbon来获取服务列表  ，负载均衡
        return this.restTemplate.getForObject("http://application/book/"+id,Book.class); //第一个是地址   第二个是实例  //将字符串转成对象叫做反序列化     将对象转成字符串叫做反序列化

    }
}
