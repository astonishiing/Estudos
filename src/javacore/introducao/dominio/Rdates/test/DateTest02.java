package javacore.introducao.dominio.Rdates.test;


import javacore.introducao.dominio.Gassociacao.dominio.Local;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTest02 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = localDate.atTime(localTime);

        DateTimeFormatter formatterISO = DateTimeFormatter.ISO_DATE_TIME;

        // Um dos caminhos existentes para conversão de tipo temporal moderno para o tipo legado
        Instant instant = localDateTime.toInstant(ZoneOffset.ofHours(-3));
        Calendar calendar = Calendar.getInstance();
        Date date = Date.from(instant);
        calendar.setTime(date);

        // Caminho inverso da conversão
        Date date1 = new Date();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date1);
        ZoneId zoneId = calendar1.getTimeZone().toZoneId();
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(calendar1.toInstant(), zoneId);

        // OffsetDateTime
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetDateTime offsetDateTimeUTC = offsetDateTime.withOffsetSameInstant(ZoneOffset.UTC);
        OffsetDateTime offsetDateTimeCalendar = Calendar.getInstance().getTime().toInstant().atOffset(ZoneOffset.ofHours(-3));

        // Converte um tipo temporal moderno para um tipo temporal legado
        Date date2 = Date.from(offsetDateTime.toInstant());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);

        // -------------------------------------------------------------

        // O "a" serve para informar se é PM ou AM para evitar ambiguidade, porem não é necessário
        DateTimeFormatter dateTimePattern = DateTimeFormatter.ofPattern("hh:mm:ss a");

        LocalDate localDate1 = LocalDate.of(2020, 6, 21);
        LocalDate localDate2 = LocalDate.of(2020, 6, 21);

        //Conversão para String
        String strDate = "22/12/2025";



        /* Chamadas de métodos que retornam valores
        localDate.getMonth();
        localDate.getDayOfYear();
        localDate.getYear();

        E outras
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(localDate));

        System.out.println("===== Conversão para String (ISO 8601 / YMD) =====");
        System.out.println(LocalDate.parse(strDate, formatter));

        System.out.println("==== Exibição em dia/mes/ano (DMY) ");
        System.out.println(formatter.format(LocalDate.parse(strDate, formatter)));

        System.out.println("==== Adicionando 50 dias ====");
        System.out.println(localDate.plus(50, ChronoUnit.DAYS));

        System.out.println("=== Adicionando 20 anos ====");
        System.out.println(localDate.plusYears(20));

        System.out.println("=== Subtraindo 20 anos ====");
        System.out.println(localDate.minusYears(20));

        System.out.println("=== Verificar a igualdade lógica(mesmo conteúdo) na memória ===");
        System.out.println(localDate1.equals(localDate2));

        System.out.println("=== Horário no formato de 12 horas ===");
        System.out.println(dateTimePattern.format(localTime));

        System.out.println("=== Combinar uma data e um horario em um único objeto");
        System.out.println(formatterISO.format(localDateTime));

        System.out.println("=== Converter uma data e hora local em um instante real no tempo");
        System.out.println(date);

        System.out.println("=== Conversão entre APIs temporais ===");
        System.out.println(localDateTime1);

        System.out.println("=== Medição de duração ===");
        System.out.println(Duration.between(localDateTime, localDateTime1).toMillis());
        System.out.println(Duration.between(localDateTime, LocalDateTime.now()).toMillis());

        System.out.println("=== Normalização e transformação ===");
        System.out.println(offsetDateTime);
        System.out.println(offsetDateTimeUTC);

        System.out.println("=== Comparação temporal ");
        System.out.println(offsetDateTime.isEqual(offsetDateTimeUTC));

        System.out.println("=== Conversão de tipos===");
        System.out.println(date2);

        System.out.println("=== Conversão de um tipo legado para o moderno  ===");
        System.out.println(offsetDateTimeCalendar);
    }
}
