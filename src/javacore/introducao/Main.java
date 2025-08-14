package javacore.introducao;

public class Main {
    public static void main(String[] args) {

        printEmployee(new Manager());
        printEmployee(new Salesman());

    }

    public static void printEmployee(Employeer employeer){
        employeer.setName("Joao");
        ((Manager)employeer).setLogin("joao");
        ((Manager)employeer).setPassword("123456");

        System.out.println(employeer.getClass().getCanonicalName());

        System.out.println(employeer.getName());
        System.out.println(((Manager)employeer).getLogin());
        System.out.println(((Manager)employeer).getPassword());
    }
}
