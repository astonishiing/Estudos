package javacore.introducao.dominio.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);
    }
    private static int divisao(int a, int b){
        try{
            return a/b;
        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }
}
