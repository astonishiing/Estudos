package javacore.introducao.dominio.Exercicios.exercicios;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numFuncionario;
        int horasTrabalhadas;
        double valorHora;

        numFuncionario = input.nextInt();
        horasTrabalhadas = input.nextInt();
        valorHora = input.nextDouble();

        double salario = horasTrabalhadas * valorHora;
        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
