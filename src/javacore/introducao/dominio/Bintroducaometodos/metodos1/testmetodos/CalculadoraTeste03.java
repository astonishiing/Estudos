package javacore.introducao.dominio.Bintroducaometodos.metodos1.testmetodos;

import javacore.introducao.dominio.Bintroducaometodos.metodos1.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 0);
        System.out.println(result);

        System.out.println("-------------");

        calculadora.imprimeDivisaoDeDoisNumeros(86, 20);
    }
}
