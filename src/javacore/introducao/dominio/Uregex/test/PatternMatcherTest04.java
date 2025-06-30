package javacore.introducao.dominio.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z ou A-Z, todos os dígitos e _
        // \W = Tudo o que não for iniciado no \w
        // []
        // ? Zero ou uma ocorrência
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // | a(v|c)o ovo | oco
        // $ Representa o fim de linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
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
