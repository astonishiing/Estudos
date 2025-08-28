package javacore.introducao.dominio.Exercicios.exercicios;

import java.util.Scanner;

public class ExMedia02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A;
        double B;
        double C;

        double pesoA = 2;
        double pesoB = 3;
        double pesoC = 5;

        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        double media = (A * pesoA + B * pesoB + C * pesoC) / (pesoA + pesoB + pesoC);
        System.out.printf("MEDIA = %.1f%n", media);
    }
}
