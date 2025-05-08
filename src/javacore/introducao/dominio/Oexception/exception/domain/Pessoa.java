package javacore.introducao.dominio.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando pessoas");
    }
}
