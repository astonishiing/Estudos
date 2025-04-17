package javaintroducao.Aintroducaoclasses.test;

import javaintroducao.Aintroducaoclasses.dominio.Estudante02;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante02 estudante02 = new Estudante02();
        Estudante02 estudante03 = new Estudante02();

        estudante02.nome = "Sanji";

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
        System.out.println("---------------");

        System.out.println(estudante03.nome);
        System.out.println(estudante03.idade);
        System.out.println(estudante03.sexo);

    }
}
