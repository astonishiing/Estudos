package javacore.introducao.dominio.ZZEstreams.Predicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma funcao que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição
 */

public class PredicateExamplee {
    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JS", "C", "Ruby");

        // Criar um predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        // Imprimir cada palavra que passou no filtro
        // 1° forma
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(s -> System.out.println(s));

        //2 ° forma
        palavras.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.length() > 5;
                    }
                })
                .forEach(System.out::println);

        // 3° forma
        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }
}
