package javacore.introducao.dominio.Treino;

public class Main {
    public static void main(String[] args) {

        printEmployee(new Manager());
        printEmployee(new Salesman());

    }

    public static void printEmployee(Employeer employeer){

        System.out.printf("=======%s=======\n", employeer.getClass().getCanonicalName());

//        if (employeer instanceof Manager maneger) {
//
//        }

        switch (employeer){
            case Manager manager ->{
                employeer.setCode("123");
                employeer.setName("Joao");
                manager.setComission(100);
                manager.setSalary(5000);
                manager.setLogin("joao");
                manager.setPassword("123456");

                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getFullSalary(500));

            }
            case Salesman salesman ->{
                salesman.setCode("123");
                salesman.setName("Joao");
                salesman.setSalary(2000);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());


            }
        }
        System.out.println(employeer.getFullSalary());
        System.out.println("==============");
    }
}
