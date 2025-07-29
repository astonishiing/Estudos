package javacore.introducao.dominio.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Midorya";

    void print(final String parametro){
        final String lastName = "Izuku";

        class LocalClass {
            public void printLocal(){
                System.out.println(parametro);
                System.out.println(name + " " + lastName);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("");
    }
}
