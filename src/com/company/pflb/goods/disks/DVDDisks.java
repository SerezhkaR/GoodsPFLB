package com.company.pflb.goods.disks;

import com.company.pflb.goods.Disks;

public class DVDDisks extends Disks {
    String genre;

    public DVDDisks(String name, int price, String code, String type, String genre) {
        super(name, price, code, type);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + "\n-- Жанр диска: " + genre + "\n";
    }
}
