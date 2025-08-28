package javacore.introducao.dominio.Exercicios.exercicios;

import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeVendedor;
        double salarioFixo;
        double totalVendas;

        nomeVendedor = input.nextLine();
        salarioFixo = input.nextDouble();
        totalVendas = input.nextDouble();

        double comissao = totalVendas * 0.15;
        double montante = salarioFixo + comissao;
        System.out.printf("TOTAL = R$ %.2f%n", montante);
    }
}
