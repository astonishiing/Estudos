package javacore.introducao.dominio.Zgenerics.test;

import javacore.introducao.dominio.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest01 {
    public static void main(String[] args) {
        //Type erasure
        List<String> list = new ArrayList<>(); // Em tempo de compilação
        list.add("Midoria");

        for(String o : list){
            System.out.println(o);
        }
        add(list, new Consumidor("Midoria"));

        for (Object o : list){
            System.out.println(o);
        }
    }
    private static void add(List<String> lista, Consumidor consumidor){
        lista.add(String.valueOf(consumidor));
    }

}
