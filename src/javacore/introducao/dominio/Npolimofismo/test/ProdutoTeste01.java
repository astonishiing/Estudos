package javacore.introducao.dominio.Npolimofismo.test;

import javacore.introducao.dominio.Npolimofismo.dominio.Computador;
import javacore.introducao.dominio.Npolimofismo.dominio.Televisao;
import javacore.introducao.dominio.Npolimofismo.dominio.Tomate;
import javacore.introducao.dominio.Npolimofismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC0i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\"", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(tv);
    }

}
