package javacore.introducao.dominio.Gassociacao.test;

import javacore.introducao.dominio.Gassociacao.dominio.Aluno;
import javacore.introducao.dominio.Gassociacao.dominio.Local;
import javacore.introducao.dominio.Gassociacao.dominio.Professor;
import javacore.introducao.dominio.Gassociacao.dominio.Seminario;

public class AssociacaoTeste { // Começar
    public static void main(String[] args) {
    Local local = new Local("Rauas das laranjeiras");
    Aluno aluno = new Aluno("Saitama", 17);
    Professor professor = new Professor("Barba branca", "Pirata", );
    Aluno[] alunosParaSeminario = {aluno};
    Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);
    }


}
