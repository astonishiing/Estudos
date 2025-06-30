package javacore.introducao.dominio.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa, true, 200";
        String[] split = texto.split(",");
        for (String nomes : split) {
            System.out.println(nomes.trim());
        }

    }
}
