package javaintroducao.Aintroducaoclasses.test;

import javaintroducao.Aintroducaoclasses.dominio.Estudante01;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante01 estudante = new Estudante01();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
