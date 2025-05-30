package javacore.introducao.dominio.Pwrappres.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        // Todas as classes elas são filhas de objeto e os tipos primitivos são apenas tipos primitivos, que são representadas por bits
        // No exemplo abaixo trabalhamos com bits
        // Nós criamos tipos primitivos para representar um atributo do mundo real. As boas praticas dizem isso
        byte byter = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L; // se tirarmos o L, ele se torna inteiro,
        // 1 inteiro é menor que um long, entao todos os inteiros cabem dentro de um long
        float floatP = 10F;
        double doubleP = 10;
        char charP = 'W';
        boolean booleanP = false;

        // Classe wrapper: é escapsular o tipo primitivo e transformar em
        // Agora estamos trabalhando com objetos, então a regra de polimofismo é aplicada
        // Estamos passando a passagem do objeto por referência
        // Estrutura de dados do pacote de coleções, eles nao trabalham com tipos primitivos

        Byte byterW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        //Agora temos classes para representar os tipos primitivos
        // So utilizamos Wrappers a depender do sentido

        //------------------------------
        // Conceito de autoboxing e unboxing
        // O exemplo abaixo é um autoboxing: que é praticamente quando temos um tipo primitivo em Wrapper
        Byte byterQ = 1;
        Short shortQ = 1;
        Integer intQ = 1; // Quando temos um tipo primitivo e o Java faz a conversão automatica por um Wrapper
        Long longQ = 10L;
        Float floatQ = 10F;
        Double doubleQ = 10D;
        Character charQ = 'W';
        Boolean booleanQ = false;

        // O conceito de unboxing: transformar um tipo Wrapper em tipo primitivo
        //Podemos utilizar outros métodos, apesar de não ser mais utilizado

        //Exemplo:
        int i = intW;
        //int a = intQ.longValue();
        Integer intW2 = Integer.parseInt("1"); // Transforma uma String em valor Wrapper correpondente
        boolean verdadeiro = Boolean.parseBoolean("true"); // Todos os Wrappers, tem um método estático chamado parse...
        System.out.println(verdadeiro);

        System.out.println("----------");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
