package javacore.introducao.dominio.ZZClambdas.test;

import javacore.introducao.dominio.ZZClambdas.dominio.Anime;
import javacore.introducao.dominio.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencesTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berseck", 5), new Anime("One Piece", 900), new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
