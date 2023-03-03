package com.library.model.service;

import com.library.model.entity.Book;
import com.library.model.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public class BookService implements ServiceImpl<Book,Long>{
    @Override
    public Book save(Book book) throws Exception {
        CrudRepository<Book,Long> bookDa = new CrudRepository();
        return bookDa.save(book);
    }

    @Override
    public Book edit(Book book) throws Exception {
        CrudRepository<Book,Long> bookDa = new CrudRepository<>();
        return bookDa.edit(book);
    }

    @Override
    public Book deactivate(Long id) throws Exception {
        CrudRepository<Book,Long> bookDa = new CrudRepository<>();
        return bookDa.deactivate(Book.class,id);
    }

    @Override
    public List<Book> findAll() throws Exception {
        CrudRepository<Book,Long> bookDa = new CrudRepository<>();
        return bookDa.findAll(Book.class);
    }

    @Override
    public Book findById(Long id) throws Exception {
        CrudRepository<Book,Long> bookDa = new CrudRepository<>();
        return bookDa.findById(Book.class,id);
    }

    @Override
    public List<Book> executeQuery(String namedQuery, Map<String, Object> params) throws Exception {
        return null;
    }
}
