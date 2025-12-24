package javacore.introducao.dominio.ZZEstreams.Supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Representa uma operação que não aceita nenhum argumento  e retorna um resultado do tipo T.
 * É comumente usadda para criar ou fornecer novos objetos de um determinado tipo.
 *
 */
public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo!";

        //Usar o Supplier para obter uma lista com 5 saudações
        // 1° forma

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());


        //2° forma

        List<String> listaSaudacoes1 = Stream.generate(
                new Supplier<String>() {
                    @Override
                    public String get() {
                        return "Olá, seja bem-vindo!";
                    }
                }
        )
                .limit(3)
                .collect(Collectors.toList());

        //3 ° forma
        List<String> listaSaudacoes2 = Stream.generate(() -> "Olá, seja bem-vindo!")
                .limit(4)
                .toList();
        //Collectors nos ajuda a transformar em uma lista

        //Imprimir as saudações geradas
        listaSaudacoes.forEach(s -> System.out.println(s));
        System.out.println("==========================");
        listaSaudacoes1.forEach(System.out::println);
        System.out.println("================");
        listaSaudacoes2.forEach(s -> System.out.println(s));
    }
}
