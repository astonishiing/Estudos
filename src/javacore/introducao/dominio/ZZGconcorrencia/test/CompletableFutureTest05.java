package javacore.introducao.dominio.ZZGconcorrencia.test;

import javacore.introducao.dominio.ZZGconcorrencia.dominio.Quote;
import javacore.introducao.dominio.ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;


public class CompletableFutureTest05 {
    public static void main(String[] args) {
        StoreServiceWithDiscount storeServiceWithDiscount = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(storeServiceWithDiscount);
    }



    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        var completableFutures = stores.stream()
                // Getting the price async storeName:price:discountCode
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPrinceSync(s)))
                // Instantiating a new quote from the string genereated by getPriceSync
                .map(cf -> cf.thenApply(Quote::newQuote))
                // Composing the first commpletable future
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s finished in %d%n", store, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);

//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);
        CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(completableFutures);
        voidCompletableFuture.join();
        System.out.printf("Finished? %b%n", voidCompletableFuture.isDone());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPrinceSync %dms%n", (end - start));
    }
}
