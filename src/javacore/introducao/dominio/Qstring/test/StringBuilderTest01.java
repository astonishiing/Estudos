package javacore.introducao.dominio.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Willian";
        nome = nome.concat(" TestBuffer");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Willian"); //Caso criamos e não passamos nenhum valor, ela é iniciado com 16
        sb.append(" TestBuilder").append(" 1234");
        sb.reverse();
        System.out.println(sb);

    }
}
