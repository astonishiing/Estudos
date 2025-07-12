package javacore.introducao.dominio.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); // o valor entre <> tem que ser um objeto, nao pode ser nenhum tipo primitivo
        // pode ser utilizados os Wrappers
        List<String> nomes1 = new ArrayList<>();
        nomes.add("Wagner");
        nomes.add("Dev");
        nomes1.add("JavaC");
        nomes1.add("Academy");

//        nomes.remove(1);
//        nomes.remove("Wagner");
        nomes.addAll(nomes1);


        for (String nome: nomes){
            System.out.println(nome);
        }
        nomes.add("Suane");
        System.out.println("-----------");

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>(); // Chama o equals(), hashCode();
        numeros.add(1); // o java tem o conceito de autoboxing e unboxing
        // Não podemos  criar coleções com tipos primitivos porque
    }
}
