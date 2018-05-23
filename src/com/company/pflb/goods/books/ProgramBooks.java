package com.company.pflb.goods.books;

import com.company.pflb.goods.Books;

public class ProgramBooks extends Books{
    String language;

    public ProgramBooks(String name, int price, String code, int pages, String language) {
        super(name, price, code, pages);
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString() + "\n-- Язык программирования: " + language + "\n";
    }
}
