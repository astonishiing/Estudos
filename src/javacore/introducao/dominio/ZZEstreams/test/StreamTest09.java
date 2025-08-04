package javacore.introducao.dominio.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {


    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.println(n + " "));
        System.out.println();
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.println(n + " "));
        System.out.println();

        Stream.of("Eleve", " 0", " Cosmo", " no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        int num[] = {1, 2, 3, 4, 5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        try (Stream<String> line = Files.lines(Paths.get("file.txt"))) {
//            line.forEach(System.out::println); // Mostra todas as informações que estão no txt
            line.filter(l -> l.contains("Java")).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
