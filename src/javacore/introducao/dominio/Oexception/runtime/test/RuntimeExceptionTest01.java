package javacore.introducao.dominio.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        Object object = null; // se nós nao dermos um objeto para a variável de referência e tentar acessa-la, teremos um nullPointException
        System.out.println(object.toString());
    }
    // Checked e uncheked
    // Exception Checked são exceptions que são filhas da classe exception diretamente, se nao forem tratadas. Eles causarão error em tempo de compilação
}
