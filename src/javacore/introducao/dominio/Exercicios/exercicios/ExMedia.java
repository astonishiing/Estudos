package javacore.introducao.dominio.Exercicios.exercicios;

import java.util.Scanner;

public class ExMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A;
        double B;

        A = input.nextDouble();
        B = input.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;

        double media = (A * pesoA + B * pesoB) / (pesoA + pesoB);

        if(A <= 10.0 && B <= 10.0){
            System.out.printf("MEDIA = %.5f", media);
        }else {
            System.out.printf("Presentation Error");
        }
    }
}
