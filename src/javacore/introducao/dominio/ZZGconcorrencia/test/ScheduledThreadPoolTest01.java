package javacore.introducao.dominio.ZZGconcorrencia.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
    private static final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(formatter) + " beep   ");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

//        executorService.schedule(r, 5, TimeUnit.SECONDS);
//        ScheduledFuture<?> scheduleWithFixedDelay = executorService.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS); // Do momento em que a Thread acorda ele começa a contar
        ScheduledFuture<?> scheduleWithFixedDelay = executorService.scheduleAtFixedRate(r, 1, 5, TimeUnit.SECONDS); // Ele é continuo, mantendo a retroatividade
        executorService.schedule(() -> {
            System.out.println("Cancelando o scheduleWithFixedDelay");
            scheduleWithFixedDelay.cancel(false);
            executorService.shutdown();
        }, 10, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(formatter));
        beeper();
    }
}
