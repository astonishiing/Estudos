package javacore.introducao.dominio.Qstring.test;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.Period;

public class StringBuilderTest02 {
    public static void main(String[] args) {

        OffsetDateTime stringStart = OffsetDateTime.now();

        String stringConcat = "value";
        for(int i = 0; i < 20000; i++){
            stringConcat += i;
        }
        OffsetDateTime stringEnd = OffsetDateTime.now();

        System.out.printf("String: %s \n", getInterval(stringStart, stringEnd));



        OffsetDateTime builderStart = OffsetDateTime.now();
        StringBuilder builderConcat = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            builderConcat.append(i);
        }
        OffsetDateTime builderEnd = OffsetDateTime.now();

        System.out.printf("StringBuilder (singlethread): %s \n", getInterval(builderStart, builderEnd));



        OffsetDateTime bufferStart = OffsetDateTime.now();
        StringBuffer bufferConcat = new StringBuffer();
        for (int i = 0; i < 20000; i++) {
            bufferConcat.append(i);
        }
        OffsetDateTime bufferEnd = OffsetDateTime.now();
        System.out.printf("StringBuffer (multithread): %s \n", getInterval(bufferStart, bufferEnd));
    }

    private static long getInterval(OffsetDateTime builderStart, OffsetDateTime builderEnd) {
        return Duration.between(builderStart, builderEnd).toMillis();
    }
}
