package javacore.introducao.dominio.sobrecargametodos.test;

import javacore.introducao.dominio.sobrecargametodos.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudame Drive","Tv", 12, "Acao");
        /*anime.setNome("Akudame Drive");
        anime.setTipo("TV");
        anime.setEpisodios(12);*/

        anime.imprime();
    }

}
