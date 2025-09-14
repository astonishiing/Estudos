package javacore.introducao.dominio.Exercicio01;
import java.math.BigDecimal;
import java.util.Scanner;


public class PromocaoRelampago {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String valorCompra = input.nextLine();
        System.out.println(calcularDesconto(valorCompra));
        input.close();
    }
    public static String calcularDesconto(String valorCompra){
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal descontoPercentual;
        BigDecimal limite1 = new BigDecimal("50.00");
        BigDecimal limite2 = new BigDecimal("100.00");

        if (valor.compareTo(limite1) < 0 ) {
            descontoPercentual = BigDecimal.ZERO;
        }

        else if(valor.compareTo(limite1) >= 0 && valor.compareTo(limite2) <= 0){
            descontoPercentual = new BigDecimal("10");
        }

        else {
            descontoPercentual = new BigDecimal("20");
        }

        return "Desconto de " + descontoPercentual + "%";
    }
}
