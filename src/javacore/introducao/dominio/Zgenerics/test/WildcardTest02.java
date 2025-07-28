package javacore.introducao.dominio.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);

        List<Animal> animals = new ArrayList<>();
        printConsulta(animals);
        printConsulta(cachorros);
    }

    //Type erasure (?)

    private static void printConsulta(List<? extends Animal> animals){
        // Podemos receber Animal ou qualquer 1 que seja filho
        // A partir desse momento não podemos mais adicionar outras listas, ou adicionar algo na propria lista
        for (Animal animal : animals) {
            animal.consulta();
        }

    }

    private static void printConsultaAnimal(List<? super Animal> animals){
        // Posso receber Animal ou qualquer 1 que seja pai
        Animal animal = new Cachorro();
        Animal animal2 = new Gato();
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
