package javacore.introducao.dominio.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List nomes = new ArrayList(); // 1.4 Java
        nomes.add("Wagner");
        nomes.add("Dev");

        for (Object nome: nomes){
            System.out.println(nome);
        }
    }
}
