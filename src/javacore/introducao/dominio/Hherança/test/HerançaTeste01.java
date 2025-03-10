package javacore.introducao.dominio.Hherança.test;

import javacore.introducao.dominio.Hherança.dominio.Endereco;
import javacore.introducao.dominio.Hherança.dominio.Pessoa;

public class HerançaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-444");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Shimazu");
        pessoa.setCpf("111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
    }
}
