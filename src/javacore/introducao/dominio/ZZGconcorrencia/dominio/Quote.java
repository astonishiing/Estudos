package javacore.introducao.dominio.ZZGconcorrencia.dominio;


public final class Quote {
    private final String store;
    private final double price;
    private final Discount.Code discountCode;

    private Quote(String store, double price, Discount.Code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;
    }

    public static Quote newQuote
}
