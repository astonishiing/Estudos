package javacore.introducao.dominio.Isobrescrita.test;

import javacore.introducao.dominio.Isobrescrita.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dr. Stone");
        System.out.println(anime.toString());
        //Nesse caso não ha a necessida de chamar .toString(), pois a propria IDE faz isso para você de forma implicita

    }
}
