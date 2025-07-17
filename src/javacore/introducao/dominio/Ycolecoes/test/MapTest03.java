package javacore.introducao.dominio.Ycolecoes.test;

import javacore.introducao.dominio.Ycolecoes.dominio.Consumidor;
import javacore.introducao.dominio.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Willian");
        Consumidor consumidor2 = new Consumidor("Dev");

        Manga manga1 = new Manga(5L, "Helsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L,"Berserk", 9.5);
        Manga manga3 = new Manga(4L,"Pokemin", 3.2);
        Manga manga4 = new Manga(3L,"Attack on Titan",11.20);
        Manga manga5 = new Manga(2L,"Dragon ball Z", 2.99);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();




    }
}
