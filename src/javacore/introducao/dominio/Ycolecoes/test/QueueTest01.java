package javacore.introducao.dominio.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("D");
        fila.add("B");
        fila.add("A");

        for (String s : fila) {
            System.out.println(s);
        }

        fila.peek(); // ira mostrar o elemento sem remover da lista
        fila.poll(); // pega o elemento da fila e ira remover
        fila.offer(); // é parecido com add


    }
}
