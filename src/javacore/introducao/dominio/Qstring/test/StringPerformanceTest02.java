package javacore.introducao.dominio.Qstring.test;

public class StringPerformanceTest02 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("1234567890");
        StringBuilder delete = builder.delete(0, 3);
        StringBuilder deleteCharAt = builder.deleteCharAt(4);

        System.out.println(delete);
        System.out.println(deleteCharAt);
        System.out.println(builder.reverse()); //Reverte todos os caracteres
        System.out.println(builder.insert(5, "a")); //Fazer inserções
        System.out.println(builder.lastIndexOf("7"));
    }
}
