package javacore.introducao.dominio.ZZDoptional.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {

    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("test1234");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("-----------------");

        Optional<String> nameOptional = findName("Willian");
        String empty = nameOptional.orElse("EMPTY");

        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
//        System.out.println(nameOptional);
        System.out.println(empty);

    }

    private static Optional<String> findName(String name) {
        List<String> strings = List.of("Willian", "DevDojo");
        int i = strings.indexOf(name);
        if(i != 1){
            return Optional.of(strings.get(i));
        }
        return Optional.empty();
    }
}
