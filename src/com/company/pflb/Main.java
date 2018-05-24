package com.company.pflb;

import com.company.pflb.goods.Books;
import com.company.pflb.goods.Disks;
import com.company.pflb.goods.books.CookeryBooks;
import com.company.pflb.goods.books.EsotericBooks;
import com.company.pflb.goods.books.ProgramBooks;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Disks a = new Disks("Windows 10", 3000, "152FD5W5", "DVD", "ПО");
        Disks b = new Disks("Linkin Park", 400, "45257GW42F", "CD", "музыка");

        ProgramBooks c = new ProgramBooks("Программирование для чайников", 1200, "FAD24R54R2", 1342, "Java");
        CookeryBooks d = new CookeryBooks("Итальянская кухня", 750, "SFKGN7828", 347, "Тесто");
        EsotericBooks e = new EsotericBooks("Полный сборник заклинаний", 800, "HJKGJ9GH8G", 249, 18);

        ArrayList<Books> books = new ArrayList<>();
        books.add(c);
        books.add(d);
        books.add(e);

        ArrayList<Disks> disks = new ArrayList<>();
        disks.add(a);
        disks.add(b);

        for (Disks disk : disks
                ) {
            System.out.println("Диск\n" + disk);
        }

        for (Books book : books
                ) {
            System.out.println("Книга\n" + book);
        }
    }
}
