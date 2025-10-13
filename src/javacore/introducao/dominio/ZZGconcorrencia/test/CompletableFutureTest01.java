package javacore.introducao.dominio.ZZGconcorrencia.test;

import javacore.introducao.dominio.ZZGconcorrencia.service.StoreService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
//        searchPrinceSync(storeService);
        searchPricesAsyncFuture(storeService);
    }

    private static void searchPrinceSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPrinceSync("Store 1"));
        System.out.println(storeService.getPrinceSync("Store 2"));
        System.out.println(storeService.getPrinceSync("Store 3"));
        System.out.println(storeService.getPrinceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPrinceSync %d%n", (end-start));
    }

    private static void searchPricesAsyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture1 = storeService.getPricesAsyncFuture("Store 1");
        storeService.getPricesAsyncFuture("Store 2");
        storeService.getPricesAsyncFuture("Store 3");
        storeService.getPricesAsyncFuture("Store 4");
        try {
            .get();
            .get();
            .get();
            .get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPrinceSync %d%n", (end-start));
        StoreService.shutdown();
    }
}
