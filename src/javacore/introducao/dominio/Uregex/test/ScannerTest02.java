package javacore.introducao.dominio.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            //System.out.println(scanner.next());
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("int: " +i);
            }else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("boolean: " + b);
            }else {
                System.out.println(scanner.next());
            }
        }
    }
}
