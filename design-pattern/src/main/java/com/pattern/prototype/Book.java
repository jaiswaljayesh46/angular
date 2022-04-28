package com.pattern.prototype;

public class Book {
    private Integer bookId;
    private String BookName;

    public Book(Integer bookId, String bookName) {
        this.bookId = bookId;
        BookName = bookName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", BookName='" + BookName + '\'' +
                '}';
    }
}
