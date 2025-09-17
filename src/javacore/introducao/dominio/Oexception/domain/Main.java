package javacore.introducao.dominio.Oexception.domain;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
       test();
        System.out.println("terminou");
    }

    private static void test(){
        throw new RuntimeException();
    }
}
