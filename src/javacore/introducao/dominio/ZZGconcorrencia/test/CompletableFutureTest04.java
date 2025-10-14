package javacore.introducao.dominio.ZZGconcorrencia.test;

import javacore.introducao.dominio.ZZGconcorrencia.dominio.Quote;
import javacore.introducao.dominio.ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;


public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount storeServiceWithDiscount = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(storeServiceWithDiscount);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
//        stores.forEach(s -> System.out.println(service.getPrinceSync(s)));
        stores.stream()
                .map(service::getPrinceSync)//store:price:code
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPrinceSync %dms%n", (end - start));
    }

    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscount service){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<String>> completableFutures = stores.stream()
                // Getting the price async storeName:price:discountCode
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPrinceSync(s)))
                // Instantiating a new quote from the string genereated by getPriceSync
                .map(cf -> cf.thenApply(Quote::newQuote))
                // Composing the first commpletable future
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .collect(Collectors.toList());

        completableFutures.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPrinceSync %dms%n", (end - start));
    }
}
