package javacore.introducao.dominio.Exercicios.test;

import javacore.introducao.dominio.Exercicios.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carroNovo = new Carro();

        carroNovo.nome = "Lambo";
        carroNovo.modelo = "Aventador";
        carroNovo.ano = 2010;

        System.out.println("Carro 1");
        System.out.println(carro.ano + " " + carro.nome + " " + carro.modelo);
        System.out.println("\nCarro 2");
        System.out.println(carroNovo.ano + " " + carroNovo.nome + " " + carroNovo.modelo);
    }
}
