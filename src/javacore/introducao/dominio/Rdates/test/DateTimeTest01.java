package javacore.introducao.dominio.Rdates.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTest01 {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        Date dateMillis = new Date(currentTimeMillis);

        Date date = new Date();

        Date date2 = new Date(System.currentTimeMillis() - 999999L);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

        System.out.println(date);
        System.out.println(dateFormat.format(date));

        System.out.println("============");
        System.out.println(date2);

        System.out.println("=============");
        System.out.println(dateMillis.before(new Date(currentTimeMillis + 99999)));
        System.out.println(new Date(currentTimeMillis + 99999).after(dateMillis));


    }


}
