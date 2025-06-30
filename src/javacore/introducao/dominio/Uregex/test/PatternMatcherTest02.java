package javacore.introducao.dominio.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // willian.suane@dev.academy
        String regex = "ab";
        String texto = "abaaba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:    " + texto);
        System.out.println("indice: 0123456789 ");
        System.out.println("regex:   " + regex);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() +"\n");
        }
    }
}
