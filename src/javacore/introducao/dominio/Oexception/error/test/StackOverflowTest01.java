package javacore.introducao.dominio.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }
    // Quando a stack estoura, nao tem como resolver
    // Nesse caso temos que tirar a recursivade ou melhorar a forma como irá parar

    public static void recursividade(){
        recursividade();
    }
}
