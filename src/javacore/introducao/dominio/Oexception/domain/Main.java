package javacore.introducao.dominio.Oexception.domain;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
       test();
        System.out.println("terminou");
    }

    private static void test(){
                    new Throwable(); //Pai de exceptions e errors
                    /                         \
                     new Exception();            new Error(); // Errors
                /                  \
      new RuntimeException();  //unchecked FileNotFoundException();
    }
}
