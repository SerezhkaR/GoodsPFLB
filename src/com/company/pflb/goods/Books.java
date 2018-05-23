package com.company.pflb.goods;

import com.company.pflb.Goods;

public class Books extends Goods {
    int pages;

    public Books(String name, int price, String code, int pages) {
        super(name, price, code);
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + "\n-- Количество страниц: " + pages;
    }
}
