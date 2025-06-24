package javacore.introducao.dominio.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1750786599260L); //Trabalha com milisegundos (Long)
        System.out.println(date.getTime());
    }



}
