package javacore.introducao.dominio.ZZEstreams.test;

public class StreamTest16 {


    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000L;
        sumFor(num);
    }
    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0L;
        long init = System.currentTimeMillis();
        for(long i = 1; i <= num ; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }


}
