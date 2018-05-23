package com.company.pflb.goods.books;

import com.company.pflb.goods.Books;

public class EsotericBooks extends Books {
    int age;

    public EsotericBooks(String name, int price, String code, int pages, int age) {
        super(name, price, code, pages);
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "\n-- Минимальный возраст читателя: " + age + "\n";
    }
}
