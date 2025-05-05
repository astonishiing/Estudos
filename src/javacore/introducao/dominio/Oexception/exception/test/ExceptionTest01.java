package javacore.introducao.dominio.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile(); //Nesse exemplo temos um error de compilação, porque a exception não esta sendo tratada
            System.out.println("Arquivos criado: " + isCriado);
        } catch (IOException e) { // a classe (Exception) ela é generica, as boas práticas nao recomendam utilizar ela
            e.printStackTrace();
        }

    }
}
