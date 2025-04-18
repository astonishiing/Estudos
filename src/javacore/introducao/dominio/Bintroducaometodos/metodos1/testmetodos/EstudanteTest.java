package javacore.introducao.dominio.Bintroducaometodos.metodos1.testmetodos;

import javacore.introducao.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); //temos que dar um nome a uma variavel mesmo que ela seja uma class, que nesse caso ém um exemplo
        //temos uma variavel de referência do tipo "Estudante", e para criar objetos precisamos utilizar o "new"

        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.idade + " " + estudante.nome + " " + estudante.sexo);
    }

}
