package com.company.pflb.goods;

public class Disks extends Goods {
    String type;
    String genre;

    public Disks(String name, int price, String code, String type, String genre) {
        super(name, price, code);
        if (type.equals("DVD") | type.equals("CD")) {
            this.type = type;
        } else throw new IllegalArgumentException("Указан неверный тип диска");

        if (genre.equals("музыка") | genre.equals("видео") | genre.equals("ПО")) {
            this.genre = genre;
        } else throw new IllegalArgumentException("Указан неверный жанр диска");
    }

    @Override
    public String toString() {
        return super.toString() + "\n-- Тип диска: " + type + "\n-- Жанр диска: " + genre + "\n";
    }
}
