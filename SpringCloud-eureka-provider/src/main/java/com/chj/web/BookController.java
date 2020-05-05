package com.chj.web;

import com.chj.model.Book;
import com.chj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 9:44
 * @params :
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    /** 方法描述 
    * @Description: 生产者查询数据
    * @Param: []
    * @return: java.util.List<com.chj.model.Book>
    * @Author: chj
    * @Date: 2020/5/5
    */
    @GetMapping("/proBookAll")
    public List<Book> selectAll(){
        return bookService.selectAll();
    }
}
