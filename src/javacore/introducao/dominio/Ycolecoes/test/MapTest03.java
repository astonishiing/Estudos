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

        List<Manga> mangaListConsumidor1 = List.of(manga1, manga2, manga3);
        List<Manga> mangaListConsumidor2 = List.of(manga1, manga2, manga3);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaListConsumidor1);
        consumidorMangaMap.put(consumidor2, mangaListConsumidor2);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }

        }

    }
}
