package javacore.introducao.dominio.Qstring;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1000);
        long fim = System.currentTimeMillis();
        System.out.println("Tamanho gasto para String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tamanho gasto para StringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tamanho gasto para StringBuffer " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho){ //Fazer um for, e transformar o "i" em uma String
        //String são imutáveis
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; // 0, a primeira iteração ele vai representar e assim por diante, então na proxiam será: 01, 012, 013, ..., n

        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);

        }
    }

    private static void concatStringBuffer(int tamanho){ //Fazer um for, e transformar o "i" em uma String
        //String são imutáveis
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i); // 0, a primeira iteração ele vai representar e assim por diante, então na proxiam será: 01, 012, 013, ..., n

        }
    }
}
