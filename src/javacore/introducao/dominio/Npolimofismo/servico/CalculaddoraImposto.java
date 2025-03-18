package javacore.introducao.dominio.Npolimofismo.servico;

import javacore.introducao.dominio.Npolimofismo.dominio.Computador;
import javacore.introducao.dominio.Npolimofismo.dominio.Tomate;

public class CalculaddoraImposto {
    public void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    public void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
