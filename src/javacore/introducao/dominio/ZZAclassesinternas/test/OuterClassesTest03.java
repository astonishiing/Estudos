package javacore.introducao.dominio.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Willian";

    static class Nested {
        private String lastName = "Souza";
        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
