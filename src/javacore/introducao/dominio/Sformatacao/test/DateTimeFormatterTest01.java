package javacore.introducao.dominio.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2025-06-28T21:37:36.1170585");
        System.out.println(parse4);

        //dd/MM/uuuu
        //MM/dd/uuuu
        //yyyy/MM/dd
        DateTimeFormatter dateTimeFormatterBrazil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(dateTimeFormatterBrazil);
        System.out.println(formatBR);
        LocalDate parseBR  = LocalDate.parse("19/02/2021", dateTimeFormatterBrazil);
        System.out.println(parseBR);

        DateTimeFormatter dateTimeFormatterGERMAN = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGERMAN = LocalDate.now().format(dateTimeFormatterGERMAN);
        System.out.println(formatGERMAN);
        LocalDate parseGERMAN = LocalDate.parse("19.Juni.2021", dateTimeFormatterGERMAN);
        System.out.println(parseGERMAN);

    }
}
