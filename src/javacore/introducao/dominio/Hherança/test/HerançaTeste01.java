package javacore.introducao.dominio.Hherança.test;

import javacore.introducao.dominio.Hherança.dominio.Endereco;
import javacore.introducao.dominio.Hherança.dominio.Funcionario;
import javacore.introducao.dominio.Hherança.dominio.Pessoa;

public class HerançaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-444");

        Pessoa pessoa = new Pessoa("Shimazu");
        // pessoa.setNome();
        pessoa.setCpf("111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda");
        //funcionario.setNome();
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("-----------------");
        funcionario.imprime();
    }
}
