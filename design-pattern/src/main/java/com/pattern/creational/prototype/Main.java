package com.pattern.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("BookShop-1");
        bs.loadData();
        System.out.println(bs);

        System.out.println("After creating prototype");

        BookShop protypeBs = bs.clone();
        protypeBs.setShopName("BookShop-2");
        System.out.println(protypeBs);

        System.out.println("After removing from main bookshop");
        bs.getBooks().remove(1);
        System.out.println(bs);
        System.out.println(protypeBs);

    }
}
/*
====o/p======
BookShop{shopName='BookShop-1', books=[Book{bookId='0', BookName='Book 0'}, Book{bookId='1', BookName='Book 1'}, Book{bookId='2', BookName='Book 2'}, Book{bookId='3', BookName='Book 3'}, Book{bookId='4', BookName='Book 4'}]}
After creating prototype
BookShop{shopName='BookShop-2', books=[Book{bookId='0', BookName='Book 0'}, Book{bookId='1', BookName='Book 1'}, Book{bookId='2', BookName='Book 2'}, Book{bookId='3', BookName='Book 3'}, Book{bookId='4', BookName='Book 4'}]}
After removing from main bookshop
BookShop{shopName='BookShop-1', books=[Book{bookId='0', BookName='Book 0'}, Book{bookId='2', BookName='Book 2'}, Book{bookId='3', BookName='Book 3'}, Book{bookId='4', BookName='Book 4'}]}
BookShop{shopName='BookShop-2', books=[Book{bookId='0', BookName='Book 0'}, Book{bookId='1', BookName='Book 1'}, Book{bookId='2', BookName='Book 2'}, Book{bookId='3', BookName='Book 3'}, Book{bookId='4', BookName='Book 4'}]}

 */
