package com.company.pflb.goods.disks;

import com.company.pflb.Goods;
import com.company.pflb.goods.Disks;

public class CDDisks extends Disks {
    String genre;

    public CDDisks(String name, int price, String code, String type, String genre) {
        super(name, price, code, type);
        if (genre.equals("музыка") | genre.equals("видео") | genre.equals("ПО")) {
            this.genre = genre;
        } else throw new IllegalArgumentException("Указан неверный жанр диска");
    }

    @Override
    public String toString() {
        return super.toString() + "\n-- Жанр диска: " + genre + "\n";
    }
}
