package javacore.introducao.dominio.ZZIoptional.test;

import javacore.introducao.dominio.ZZIoptional.domain.SexEnum;
import javacore.introducao.dominio.ZZIoptional.domain.User;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<User> optional = Optional.of(new User("Joao", 18, SexEnum.MALE));
//        Optional<User> optional = Optional.empty();

        final int newAge = 22;

//        optional.ifPresent(System.out::println);

        optional.ifPresentOrElse(user -> {
                    System.out.printf("Usuário: %s \n", user);
                    user = new User("Joao", newAge, SexEnum.MALE);
                    System.out.printf("Usuário: %s \n", user);

                }, () -> System.out.println("Não foi informado um usuário")
        );

        System.out.println(optional.orElse(new User("Maria", 22, SexEnum.FEMALE)));
//        System.out.println(optional.orElseThrow()); Lança um exceção
//        System.out.println(optional.orElseThrow(() -> new RuntimeException("teste de exceção")));
        System.out.println(optional.orElse(defaultUser()));
        System.out.println(optional.orElseGet(Main::defaultUser));
    }

    public static User defaultUser() {
        System.out.println("Buscando valor default1");
        return new User("Maria", 22, SexEnum.FEMALE);
    }
}
