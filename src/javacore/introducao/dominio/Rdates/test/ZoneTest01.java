package javacore.introducao.dominio.Rdates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS; //Coleção de chave e valor
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneId);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(zoneId);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(zoneId);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");

        OffsetDateTime offsetDateTime = now.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, zoneOffsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime2);

        JapaneseDate japoneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japoneseDate);
        LocalDate maijiEraLocalDate = LocalDate.of(1980, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(maijiEraLocalDate);
        System.out.println(meijiEra);


    }
}
