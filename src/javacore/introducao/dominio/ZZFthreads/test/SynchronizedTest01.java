package javacore.introducao.dominio.ZZFthreads.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Integer> numbers = new ArrayList<>();

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

    public static void main(String[] args) {
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
