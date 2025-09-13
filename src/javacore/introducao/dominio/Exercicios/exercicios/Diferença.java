package javacore.introducao.dominio.Exercicios.exercicios;

import java.util.Scanner;

public class Diferença {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        int produtoA = A * B;
        int produtoB = C * D;

        int diferenca = produtoA - produtoB;

        System.out.printf("DIFERENCA = %d%n", diferenca);
    }
}
