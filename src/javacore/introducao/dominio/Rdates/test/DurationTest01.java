package javacore.introducao.dominio.Rdates.test;

import javacore.introducao.dominio.Gassociacao.dominio.Local;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().plusHours(7);


        //ISO 8601
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        System.out.println(d1);
    }
}
