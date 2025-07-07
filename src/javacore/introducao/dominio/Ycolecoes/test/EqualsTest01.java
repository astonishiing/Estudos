package javacore.introducao.dominio.Ycolecoes.test;

import javacore.introducao.dominio.Ycolecoes.dominio.Smartphone;
import org.w3c.dom.ls.LSOutput;

public class EqualsTest01 {
    public static void main(String[] args) {
//        String nome = "Willian";
//        String nome2 = new String("Willian");
//        System.out.println(nome.equals(nome2));
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2= new Smartphone("1ABC1", "Iphone");
        System.out.println(s1.equals(s2));
    }



}
