package javacore.introducao.dominio.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> dev = new ArrayList<>();

        List<String> graphicDesigners = List.of("Wildnei Souza", "Catariza Souza", "Sandy Castro");
        List<String> developers = List.of("Willian", "David", "Harisson");
        List<String> students = List.of("Édigo", "Gustavo Lima","Gustavo Mendes", "Guilherme" );

        dev.add(graphicDesigners);
        dev.add(developers);
        dev.add(students);

        for (List<String> people : dev) {
            for (String person : people) {
                System.out.println(person);
            }

        }
        System.out.println("---------------");

        dev.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);


    }
}
