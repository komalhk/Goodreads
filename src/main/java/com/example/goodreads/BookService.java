package com.example.goodreads;

import java.util.*;
import com.example.goodreads.Book;
import com.example.goodreads.BookRepository;

public class BookService implements BookRepository{
    private HashMap<Integer, Book> hmap = new HashMap<>();

    Book b1 = new Book(1, "harry potter", "harry_potter.jpg");
    Book b2 = new Book(2, "Rise", "rise.jpeg");

    hmap.put(b1.getId(), b1);
    hmap.put(b2.getId(), b2);

    @Override
    public ArrayList<Book> getBooks() {
        Collection<Book> bookCollection = hmap.values();
        ArrayList<Book> books = new ArrayList<>(bookCollection);
        return books;
    }
}
