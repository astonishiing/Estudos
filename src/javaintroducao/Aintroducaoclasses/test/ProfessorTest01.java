package javaintroducao.Aintroducaoclasses.test;

import javaintroducao.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nomeProfessor = "Mestre kame";
        professor.idadeProfessor = 81;
        professor.sexoProfessor = 'M';

        System.out.println(professor.nomeProfessor + " " + professor.idadeProfessor + " " + professor.sexoProfessor);
    }
}
