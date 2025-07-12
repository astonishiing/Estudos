package javacore.introducao.dominio.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on Titan");
        mangas.add("Berseck");
        mangas.add("Helsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon ball z");

        Collections.sort(mangas); //Ordernar por ordem alfabetica

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);



        for(String manga : mangas){
            System.out.println(manga);
        }
        System.out.println(dinheiros);

        Collections.sort(dinheiros);
        System.out.println(dinheiros);
    }
}
