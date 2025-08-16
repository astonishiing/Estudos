package javacore.introducao.dominio;

public record Person(String name, int age) {

    public Person{
        System.out.println("---------------");
        System.out.println(name);
        System.out.println(age);
        System.out.println("-----------------and");
    }

    public Person(String name) {
        this(name, 1);
    }
}
