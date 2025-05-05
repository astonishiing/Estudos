package javacore.introducao.dominio.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);
    }
    private static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
        } // Nesse caso o codigo da error e volta para a classe que está sendo executada
        try{
            return a/b;
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        return 0;

    }
}
