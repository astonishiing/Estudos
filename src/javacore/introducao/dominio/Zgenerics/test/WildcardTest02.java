package javacore.introducao.dominio.Zgenerics.test;

import java.util.List;


public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
//        printConsulta(cachorros);
//        printConsulta(gatos);
    }

    //Type erasure

    private static void printConsulta(List<Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
        animals.add(new Cachorro());
    }
}
