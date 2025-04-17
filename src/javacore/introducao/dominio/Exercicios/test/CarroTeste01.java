package javacore.introducao.dominio.Exercicios.test;

import javacore.introducao.dominio.Exercicios.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carroNovo = new Carro();

        carroNovo.nome = "Ferrai";
        carroNovo.modelo = "Spider";
        carroNovo.ano = 2000;

        carro.nome = "Lambo";
        carro.modelo = "Aventador";
        carro.ano = 2010;

        carro = carroNovo;

        System.out.println("Carro 1");
        System.out.println(carro.ano + " " + carro.nome + " " + carro.modelo);
        System.out.println("\nCarro 2");
        System.out.println(carroNovo.ano + " " + carroNovo.nome + " " + carroNovo.modelo);
    }
}
