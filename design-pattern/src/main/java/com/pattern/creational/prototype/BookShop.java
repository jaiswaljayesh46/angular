package com.pattern.creational.prototype;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BookShop implements Cloneable{
    private String shopName;
    private List<Book> books = new ArrayList<>();

    public void loadData(){
        //loading from database or network
        IntStream.range(0,5).forEach(i->books.add(new Book(i,"Book "+i)));
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        List<Book> newBooks =  books.stream().map(b -> new Book(b.getBookId(),b.getBookName())).collect(Collectors.toList());
        BookShop newBs =  new BookShop();
        newBs.setBooks(newBooks);
        return newBs;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
