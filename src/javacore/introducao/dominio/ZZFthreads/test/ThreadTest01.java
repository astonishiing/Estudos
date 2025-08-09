package javacore.introducao.dominio.ZZFthreads.test;

class ThreadExample extends Thread {
    private char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 500; i++) {
            System.out.print(c);
            if((i % 100) == 0) {
                System.out.println();
            }
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample('A');
        ThreadExample t2 = new ThreadExample('B');
        ThreadExample t3 = new ThreadExample('C');
        ThreadExample t4 = new ThreadExample('D');

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
