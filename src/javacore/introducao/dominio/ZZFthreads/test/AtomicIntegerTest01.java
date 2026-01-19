package javacore.introducao.dominio.ZZFthreads.test;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest01 {
    private final static AtomicInteger number = new AtomicInteger(0);

    public static void main(String[] args) {
        Runnable inc = () -> {
            for (int i = 0; i < 1000_000; i++) {
                number.incrementAndGet();
            }
        };

        Runnable dec = () -> {
            for (int i = 0; i < 1000_000; i++) {
                number.decrementAndGet();
            }
        };

        Runnable show = () -> {
            for (int i = 0; i < 1000_000; i++) {
                System.out.println(number);
            }
        };

        var execInt = new Thread(inc);
        execInt.start();
        var execDec = new Thread(dec);
        execDec.start();
        var execShow = new Thread(show);
        execShow.start();
    }
}
