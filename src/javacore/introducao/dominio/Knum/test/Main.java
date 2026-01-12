package javacore.introducao.dominio.Knum.test;

import javacore.introducao.dominio.Knum.dominio.OperationEnum;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var option = -1;
        while (option != 5) {
            System.out.println("Escolha uma opção pelo número:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            option = input.nextInt();

            if(option > 5 || option < 1) {
                System.out.println("Selectione uma opção válida");
                continue;
            }

            if (option == 5) break;

            var selectedOption = OperationEnum.values()[option - 1];

            System.out.println("Informe o primeiro valor");
            int value1 = input.nextInt();
            System.out.println("Informe o segundo valor");
            int value2 = input.nextInt();

            Integer result = selectedOption.getCalculate().apply(value1, value2);
            System.out.printf("%s %s %s = %s \n", value1, selectedOption.getSymbol(), value2, result);
        }

    }
}
