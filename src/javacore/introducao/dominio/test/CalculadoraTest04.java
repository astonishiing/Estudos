package javacore.introducao.dominio.test;

import javacore.introducao.dominio.metodos.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println(a);
        System.out.println(b);
    }
}
