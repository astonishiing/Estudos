package javacore.introducao.dominio.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date1 = LocalDate.parse("2002-08-06");
        LocalTime time1 = LocalTime.parse("09:45:00");
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
        LocalTime time = LocalTime.of(9, 45, 21);
        System.out.println(localDateTime);

        System.out.println(date1);
        System.out.println(time1);

        LocalDateTime localDateTime1 = date1.atTime(time1);
        LocalDateTime localDateTime2 = time.atDate(date1);
        LocalDateTime localDateTime3 = date1.atTime(12, 45, 00);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }
}
