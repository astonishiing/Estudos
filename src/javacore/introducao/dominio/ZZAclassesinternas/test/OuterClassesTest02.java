package javacore.introducao.dominio.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Midorya";

    void print(){
        class LocalClass {
            public void printLocal(){
                System.out.println(name);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
