package javacore.introducao.dominio.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . = 123 133 1@3 1A3

        String regex = "([a-zA-z0-9\\._-])+@([a-zA-z])+(\\.([a-zA-z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email valido: ");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());
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
