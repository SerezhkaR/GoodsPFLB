package com.company.pflb;

public class Goods {
    String name;
    int price;
    String code;

    public Goods(String name, int price, String code) {
        this.name = name;
        this.price = price;
        this.code = code;
    }

    public String toString() {
        String temp = "- Название: " + name + "\n-- Цена: " + price + "\n-- Штрих-код: " + code;
        return temp;
    }
}
