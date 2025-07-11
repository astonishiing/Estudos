package javacore.introducao.dominio.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);
        LocalDate agora = LocalDate.now();

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); //Se é ano bissexto

        System.out.println(date.get(ChronoField.YEAR_OF_ERA));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        System.out.println(date);
        System.out.println(agora);

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
