package com.company.pflb.goods.books;

import com.company.pflb.goods.Books;

public class CookeryBooks extends Books {
    String mainIngredient;

    public CookeryBooks(String name, int price, String code, int pages, String mainIngredient) {
        super(name, price, code, pages);
        this.mainIngredient = mainIngredient;
    }

    @Override
    public String toString() {
        return super.toString() + "\n-- Основной ингредиент: " + mainIngredient + "\n";
    }
}
