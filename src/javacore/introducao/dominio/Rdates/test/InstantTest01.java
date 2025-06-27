package javacore.introducao.dominio.Rdates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        //A letra T significa o tempo
        // A letra Z significa o zulu time, que no caso é utilizado pelo Instant (UTC)
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); //Representa o nano segundo do segundo 999.999.999
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
    }
}
