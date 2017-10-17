package com.charles.service;

import com.charles.domain.Book;
import com.charles.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAll(){
        return bookMapper.findAll();
    }
}
