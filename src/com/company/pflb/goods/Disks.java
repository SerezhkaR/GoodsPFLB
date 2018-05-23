package com.company.pflb.goods;

import com.company.pflb.Goods;

public class Disks extends Goods {
    String type;

    public Disks(String name, int price, String code, String type) {
        super(name, price, code);
        if (type.equals("DVD") | type.equals("CD")) {
            this.type = type;
        }
        else throw new IllegalArgumentException("Указан неверный тип диска");
    }

    @Override
    public String toString() {
        return super.toString() + "\n-- Тип диска: " + type;
    }
}
