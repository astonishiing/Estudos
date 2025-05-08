package javacore.introducao.dominio.Oexception.exception.test;

import javacore.introducao.dominio.Oexception.exception.domain.Funcionario;
import javacore.introducao.dominio.Oexception.exception.domain.LoginInvalidoException;
import javacore.introducao.dominio.Oexception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            pessoa.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
