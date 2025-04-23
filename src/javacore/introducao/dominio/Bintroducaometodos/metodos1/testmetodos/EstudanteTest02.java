package javacore.introducao.dominio.Bintroducaometodos.metodos1.testmetodos;

import javacore.introducao.dominio.Bintroducaometodos.metodos1.Estudante;
import javacore.introducao.dominio.Bintroducaometodos.metodos1.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midorya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
        System.out.println("--------------------");
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
