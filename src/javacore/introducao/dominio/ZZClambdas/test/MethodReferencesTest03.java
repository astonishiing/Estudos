package javacore.introducao.dominio.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferencesTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        list.sort(String::compareTo);

        System.out.println(list);

        Function<String, Integer> numStringToInteger = s -> Integer.parseInt(s);
    }
}
