package javacore.introducao.dominio.Csobrecargametodos.test;

import javacore.introducao.dominio.Csobrecargametodos.dominio.Anime;

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
