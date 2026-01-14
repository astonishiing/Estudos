package javacore.introducao.dominio.ZZEstreams.test;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest17 {
    public static void main(String[] args) {
        var value1 = Stream.generate(() -> new Random().nextInt())
                .limit(5)
                .toArray(Integer[]::new);

        for (Integer v : value1) {
            System.out.println(v);
        }

        System.out.println("==========");

        int[] value2 = IntStream.generate(() -> new Random().nextInt())
                .limit(5)
                .toArray();

        for (int i : value2) {
            System.out.println(i);
        }


    }
}
