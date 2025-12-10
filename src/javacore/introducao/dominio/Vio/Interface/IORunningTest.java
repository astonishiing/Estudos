package javacore.introducao.dominio.Vio.Interface;

import javacore.introducao.dominio.Vio.Interface.persistence.IOFilePersistence;

import java.io.IOException;

public class IORunningTest {
    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new IOFilePersistence("user.csv");
        System.out.println("=======================");
        System.out.println(persistence.write("Lucas;lucas@lucas.com;123456789;15/01/1990;"));
        System.out.println(persistence.write("Maria;maria@maria.com;maria6789;23/10/2000;"));
        System.out.println(persistence.write("Joao;joao@joao.com;joao789;05/09/1995;"));
        System.out.println("=======================");
        System.out.println(persistence.findAll());

        System.out.println("-------------------------------");
        System.out.println(persistence.removeContent("Lucas"));
        System.out.println("=============================");
        System.out.println(persistence.removeContent("/06/202"));
        System.out.println("===========================");

        System.out.println("=======================");
        System.out.println(persistence.findBy("Lucas;"));
        System.out.println("=======================");
        System.out.println(persistence.findBy(";maria@"));
        System.out.println("=======================");
        System.out.println(persistence.findBy("95;"));
//        System.out.println("=======================");
//        System.out.println(persistence.findBy("22;"));

        System.out.println("=======================");
        System.out.println(persistence.replaceCont(".com;maria", "Carlos;carlos@carlos.com;22/03/1991"));
        System.out.println("=====================");
        System.out.println(persistence.findAll());

    }
}
