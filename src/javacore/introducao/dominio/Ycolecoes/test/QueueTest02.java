package javacore.introducao.dominio.Ycolecoes.test;

import javacore.introducao.dominio.Ycolecoes.dominio.Consumidor;
import javacore.introducao.dominio.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L,"Helsing Ultimate", 19.9));
        mangas.add(new Manga(1L,"Berserk", 9.5));
        mangas.add(new Manga(4L,"Pokemin", 3.2));
        mangas.add(new Manga(3L,"Attack on Titan",11.20));
        mangas.add(new Manga(2L,"Dragon ball Z", 2.99));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
