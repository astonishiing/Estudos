package javacore.introducao.dominio.Oexception.exception.test;

import javacore.introducao.dominio.Oexception.exception.domain.Funcionario;
import javacore.introducao.dominio.Oexception.exception.domain.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();


    }
}
