package javacore.introducao.dominio.ZZFthreads.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SynchronizedTest01 {

    private final static List<Integer> numbers = new ArrayList<>();

    private static void inc(int number) {
        synchronized (numbers) {
            numbers.add(number);
        }
    }

    private static void show() {
        synchronized (numbers) {
            System.out.println(numbers);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable inc = () -> {
            for (int i = 0; i < 1_000; i++) {
                inc(i);
            }
        };

        Runnable dec = () -> {
            for (int i = 0; i > -10_000; i--) {
                inc(i);
            }
        };

        Runnable show = () -> {
            for (int i = 0; i < 25_000; i++) {
                show();
            }
        };

        var execInt = new Thread(inc);
        execInt.start();
        execInt.join(Duration.ofSeconds(8));
        var execDec = new Thread(dec);
        execDec.start();
//        execDec.join(Duration.ofSeconds(8));
        var execShow = new Thread(show);
        execShow.start();


        System.out.println(execInt.getName());
        System.out.println(execDec.getName());
        System.out.println(execShow.getName());

    }

}
