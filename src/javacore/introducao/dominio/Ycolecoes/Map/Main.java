package javacore.introducao.dominio.Ycolecoes.Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("joao@joao.com", new User("João", 22));
        users.put("maria@maria.com", new User("Maria", 32));
        users.put("juca@juca.com", new User("Juca", 18));
        users.put("leo@leo.com", new User("Leo", 40));

        System.out.println(users);
        System.out.println("============");
        users.keySet().forEach(System.out::println); //Retorna um set de Strings
        System.out.println("\n=============");
        users.values().forEach(System.out::println); //Retorna uma colection do nosso tipo User


        System.out.println("\n======= containsKey // containsValue (Verificações) ===========");
        System.out.println("Nesse caso ele deve retornar \"false\", pois não apresenta keys validas");
        System.out.println(users.containsKey("marcos@marcos"));
        System.out.println(users.containsValue(new User("Marcos", 40)));

        System.out.println("\nAgora no exemplo abaixo de apresentar \"true\", pois aprenseta keys validas");
        System.out.println(users.containsKey("leo@leo.com"));
        System.out.println(users.containsValue(new User("Leo", 40)));

        System.out.println("\nRemoção ");
        System.out.println(users.remove("leo@leo.com"));
        System.out.println(users.remove("leo@leo.com", new User("Leo", 40)));

        System.out.println("\n=========");
        users.forEach((k, v) -> System.out.printf("key: %s | value: %s\n", k, v));
        users.replace("joao@joao.com", new User("João", 60));
        System.out.println("====== Mudança de valores =====");
        users.forEach((k, v) -> System.out.printf("key: %s | value: %s\n", k, v));

        System.out.println("\n======== Verificar se está vazia ========");
        System.out.println(users.isEmpty());


        users.putIfAbsent("", new User("", -1));
        System.out.println(users);
    }
}
