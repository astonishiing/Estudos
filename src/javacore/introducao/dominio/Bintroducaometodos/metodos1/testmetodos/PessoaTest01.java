package javacore.introducao.dominio.Bintroducaometodos.metodos1.testmetodos;

import javacore.introducao.dominio.Bintroducaometodos.metodos1.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        //pessoa.nome = "Jiraya";
        pessoa.setNome("Jirayas");
        //pessoa.idade = 70;
        pessoa.setIdade(70);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }


}
