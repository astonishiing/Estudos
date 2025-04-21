package javacore.introducao.dominio.Bintroducaometodos.metodos1.testmetodos;

import javacore.introducao.dominio.Bintroducaometodos.metodos1.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
