package javacore.introducao.dominio.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        // String no java são imutáveis
        String nome = "Willian"; // String constant pool
        String nome2 = "Willian";
        nome = nome.concat(" Suane");
        System.out.println(nome);
        // Por causa da imutabilidade das String a não ser que façamos uma nova associação, não podemos trocar o valor que existe

        System.out.println(nome == nome2); // comparar a referência de um objeto
        String nome3 = new String("Willian"); //1. Variável de referência; 2. objeto do tipo String; 3. uma String na pool de String
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
        // Então os dois valores então fazendo referência a um mesmo objeto em memória
        // String é imutável, não é possivel alterar o valor

    }
}
