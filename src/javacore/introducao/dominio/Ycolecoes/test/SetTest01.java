package javacore.introducao.dominio.Ycolecoes.test;

import javacore.introducao.dominio.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L,"Helsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L,"Berserk", 9.5, 5));
        mangas.add(new Manga(4L,"Pokemin", 3.2, 0));
        mangas.add(new Manga(3L,"Attack on Titan",11.20, 2));
        mangas.add(new Manga(2L,"Dragon ball Z", 2.99, 0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
