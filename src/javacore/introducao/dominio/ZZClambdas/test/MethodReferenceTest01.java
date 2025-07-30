package javacore.introducao.dominio.ZZClambdas.test;

import javacore.introducao.dominio.ZZClambdas.dominio.Anime;
import javacore.introducao.dominio.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berseck", 5), new Anime("One Piece", 900), new Anime("Naruto", 500)));
//        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));

        Collections.sort(animeList, AnimeComparators::compareByTitle);
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        System.out.println(animeList);


    }
}
