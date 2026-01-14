package javacore.introducao.dominio.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest18 {
    public static void main(String[] args) {
        List<String> debugValues = new ArrayList<>();
        List<String> list = Stream.of("Maria", "Joao", "Marcio", "Luana", "Leandro", "Marcia")
//                .peek(System.out::println) //Utilizado para Debug
                .peek(debugValues::add)
                .filter(name -> name.endsWith("a"))
                .toList();

        System.out.println(debugValues);
        System.out.println(list);


        // O Exemplo abaixo seria outra forma de trabalhar com Stream<String>
        List<String> listStreamConvert = List.of("Maria", "Joao", "Marcio", "Luana", "Leandro", "Marcia")
                .stream()
                .filter(name -> name.endsWith("o"))
                .toList();

        System.out.println("=============");
        boolean b = Stream.of("Maria", "João", "Márcio", "Luana", "Leandro", "Marcia")
                .filter(n -> n.endsWith("o"))
//                .allMatch(n -> n.contains("o")) Nesse caso ele to irá retornar true, com algo que coincida com todos
                .anyMatch(n -> n.contains("a"));
        System.out.println(b);

        System.out.println("=============");

        Optional<String> first = Stream.of("Maria", "Joao", "Marcio", "Luana", "Leandro", "Marcia")
                .parallel()
                .peek(debugValues::add)
                .filter(name -> name.endsWith("z"))
                .findFirst();

        System.out.println(first);

        System.out.println("==========");

        String reduce = Stream.of("Maria", "Joao", "Marcio", "Luana", "Leandro", "Marcia")
                .reduce("", StreamTest18::apply)
                .replaceFirst(";", "");

        System.out.println(reduce);

        System.out.println("==========");
        Optional<Integer> reduce1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .reduce(Integer::sum);

        System.out.println(reduce1);

        System.out.println("=============");
        List<String> list1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .map(Object::toString)
                .toList();

        System.out.println(list1);

        System.out.println("===========");

        List<Integer> values01 = List.of(3, 6, 9, 12);
        List<Integer> values02 = List.of(1,2,3,4,5,6,7,8,9,10,11,12);

        Set<Integer> collect = values02.stream()
                .filter(values01::contains)
                .peek(n -> System.out.printf("Filter %s \n", n))
                .map(n -> values01.stream().reduce(n, (n1, n2) -> n1 - n2))
                .peek(n -> System.out.printf("Map %s \n", n))
                .collect(Collectors.toSet());

        System.out.println(collect);
    }

    private static String apply(String a, String b) {
        return a + ";" + b;
    }
}
