package javacore.introducao.dominio.Zgenerics.test;

import javacore.introducao.dominio.Zgenerics.domain.Barco;
import javacore.introducao.dominio.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGeenericoTest01 {
    public static void main(String[] args) {
//        criarArrayComObjeto(new Barco("Canoa Marrom"));
        List<Barco> barcoList= criarArrayComObjeto(new Barco("Canoa Marrom"));
        System.out.println(barcoList);
    }
    private static <T> List<T> criarArrayComObjeto(T t){
//        List<T> list = new ArrayList<>();
//        list.add(t);
//        System.out.println(t);
        return List.of(t);
    }
}


