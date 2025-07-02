package javacore.introducao.dominio.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/pasta/subpasta");
        Path clazz = Paths.get("/pasta/subpasta/dev/Olamundo.java");
        Path pathClazz = dir.relativize(clazz);
        System.out.println(pathClazz);

        Path absoluto1 = Paths.get("/pasta/subpasta");
        Path absoluto2 = Paths.get("/user/local");
        Path absoluto3 = Paths.get("/pasta/subpasta/dev/Olamundo.java");
        Path relativo1 = Paths.get("temp");
        Path relavito2 = Paths.get("temp/temp.2021921");

        System.out.println("1  " + absoluto1.relativize(absoluto3));
        System.out.println("2  " + absoluto3.relativize(absoluto1));
        System.out.println("3  " + absoluto1.relativize(absoluto2));
        System.out.println("4  " + relativo1.relativize(relavito2));
        System.out.println("5  " + absoluto1.relativize(relativo1));
    }
}
