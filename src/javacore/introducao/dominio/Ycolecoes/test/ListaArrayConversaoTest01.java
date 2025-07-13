package javacore.introducao.dominio.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] intergersArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(intergersArray));
    }
}
