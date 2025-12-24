package javacore.introducao.dominio.ZZEstreams.Funcion;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma funcao que aceita um argumento do tipo T e retorna um resultado do tipo B
 * É utilizado para transformar ou mapear os elementos do Stream em outros valores ou tipos
 */

public class FuncionExample {
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a funcao para dobrar todos os números no Stream e armazena-los em outra lista

        //1° forma
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());

        //2° forma
        List<Integer> numerosDobrados1 = numeros.stream()
                .map(
                        new Function<Integer, Integer>() {
                            @Override
                            public Integer apply(Integer integer) {
                                return integer * 2;
                            }
                        }
                )
                .collect(Collectors.toList());

        //3 ° forma
        List<Integer> numerosDobrados2 = numeros.stream()
                .map(n -> n * 2)
                .toList();

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(n -> System.out.println(n));
        System.out.println("==========");
        numerosDobrados1.forEach(System.out::println);
        System.out.println("==========");
        numerosDobrados2.forEach(n -> System.out.println(n));
    }
}
