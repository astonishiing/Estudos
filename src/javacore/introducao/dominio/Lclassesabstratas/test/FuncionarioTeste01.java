package javacore.introducao.dominio.Lclassesabstratas.test;

import javacore.introducao.dominio.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.introducao.dominio.Lclassesabstratas.dominio.Funcionario;
import javacore.introducao.dominio.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("Zoro", 2000); // Nesse caso não deveria existir apenas 1 funcionario
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Toya", 12000);
        //System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }

}
