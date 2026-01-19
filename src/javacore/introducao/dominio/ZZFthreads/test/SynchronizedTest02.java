package javacore.introducao.dominio.ZZFthreads.test;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedTest02 {

    private final static List<Integer> numbers = new ArrayList<>();

    private synchronized static void inc(int number) {
        numbers.add(number);
    }

    private synchronized static void show() {
        System.out.println(numbers);
    }

    public synchronized static void main(String[] args) {

        Runnable inc = () -> {
            for (int i = 0; i < 100_000; i++) {
                inc(i);
            }
        };

        Runnable dec = () -> {
            for (int i = 100_000; i > 0; i--) {
                inc(i);
            }
        };

        Runnable show = () -> {
            for (int i = 0; i < 250_000; i++) {
                show();
            }
        };

        new Thread(inc).start();
        new Thread(dec).start();
        new Thread(show).start();

     }
}
