package javacore.introducao.dominio.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("test")); //Pode retornar uma exceção
        System.out.println(tq.offer("test"));
        System.out.println(tq.offer("test", 10, TimeUnit.SECONDS));
        tq.put("UHHUUULL!!!");
        if(tq.hasWaitingConsumer()){
            tq.transfer("Test");
            //Bloqueia a minha Thread esperando o meu elemente, esperar o valor que eu vou colocar (synchronousQueue)
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll()); //Vai retornar nulo (ler a documentação)
        System.out.println(tq.take()); // Vai esperar até que um valor seja colocado
        System.out.println(tq.remainingCapacity());
    }
}
