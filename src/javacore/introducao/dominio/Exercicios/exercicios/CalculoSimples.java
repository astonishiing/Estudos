package javacore.introducao.dominio.Exercicios.exercicios;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codPecas1 = input.nextInt();
        int numPecas1 = input.nextInt();
        double valorPecas1 = input.nextDouble();

        int codPecas2 = input.nextInt();
        int numPecas2 = input.nextInt();
        double valorPecas2 = input.nextDouble();

        double montante = (numPecas1 * valorPecas1) + (numPecas2 * valorPecas2);
        System.out.println("VALOR A PAGAR: R$ " + montante);
    }
}
