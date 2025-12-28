package javacore.introducao.dominio.ZZEstreams.Binary;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos
 */

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o BinaryOperator para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        //Usar o binaryOperatorpara somar todos os números no Stream
        // 1° forma
        int resultado = numeros.stream()
                .reduce(0, somar); // Variável temporaria


        // 2° forma
        int resultado1 = numeros.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });

        // 3° forma
        int resultado2 = numeros.stream()
                .reduce(0, (n1, n2) -> n1 + n2); //Pode utilizar o method references

        //Imprimir o resultado da soma

        System.out.println("A soma dos números é: " + resultado);
        System.out.println("===========");
        System.out.println("A soma dos números é: " + resultado1);
        System.out.println("===========");
        System.out.println("A soma dos números é: " + resultado2);
        System.out.println("===========");
    }
}
