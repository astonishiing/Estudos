package javacore.introducao.dominio.Ycolecoes.test;

import javacore.introducao.dominio.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Helsing Ultimate", 19.9));
        mangas.add(new Manga(1L,"Berserk", 9.5));
        mangas.add(new Manga(4L,"Pokemin", 3.2));
        mangas.add(new Manga(3L,"Attack on Titan",11.20));
        mangas.add(new Manga(2L,"Dragon ball Z", 2.99));

        for (Manga manga : mangas){
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("--------------");

        for (Manga manga : mangas){
            System.out.println(manga);
        }

        Collections.sort(mangas, new MangaByIdComparator());
        System.out.println("--------------");

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
