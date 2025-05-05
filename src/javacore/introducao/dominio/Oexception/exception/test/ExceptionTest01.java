package javacore.introducao.dominio.Oexception.exception.test;

import java.io.File;

public class ExceptionTest01 {
    public static void main(String[] args) {

    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\test.txt");
        file.createNewFile(); //Nesse exemplo temos um error de compilação, porque a exception não esta sendo tratada
    }
}
