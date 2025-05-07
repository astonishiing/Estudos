package javacore.introducao.dominio.Oexception.runtime.test;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndex");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOut");
        }catch (ArithmeticException e){
            System.out.println("Dentro do Aritmentic");
        } catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }
    }
}

