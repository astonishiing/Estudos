package javacore.introducao.dominio.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String nome = "D. Luffy";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(nome);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);

        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClasses = new OuterClassesTest01();
        Inner inner = outerClasses.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
