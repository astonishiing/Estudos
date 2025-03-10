package javacore.introducao.dominio.Dconstrutores.test;

import javacore.introducao.dominio.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "Tv", 12, "Acao", "Production IG");

        //anime.init("Akudame Drive","Tv", 12, "Acao");
        /*anime.setNome("Akudame Drive");
        anime.setTipo("TV");
        anime.setEpisodios(12);*/

        anime.imprime();

    }

}
