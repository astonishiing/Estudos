package javacore.introducao.dominio.ZZEstreams.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar o Consumer com expressões lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //Usar o Consumer para imprimir números pares no Stream
        // 1° de fazer
//        numeros.forEach(imprimirNumeroPar);
        // 2° de fazer

//        numeros.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                if(integer % 2 == 0) {
//                    System.out.println(integer);
//                }
//            }
//        });

        // 3° de fazer
        numeros.forEach(integer -> {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        });
    }
}
