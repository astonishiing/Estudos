package javacore.introducao.dominio.Eblocosinicializacao.test;

import javacore.introducao.dominio.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        for(int episodios : anime.getEpisodios()){
            System.out.print(episodios + " ");
        }
    }
}
