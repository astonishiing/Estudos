package javacore.introducao.dominio.Oexception.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }
    // Quando a stack estoura, nao tem como resolver

    public static void recursividade(){
        recursividade();
    }
}
