package javacore.introducao.dominio.ZZIoptional.test;

import javacore.introducao.dominio.ZZIoptional.domain.SexEnum;
import javacore.introducao.dominio.ZZIoptional.domain.User;
import javacore.introducao.dominio.ZZIoptional.domain.UserV2;

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

        System.out.println("===============");

        Optional<UserV2> userV2 = optional.map(user -> new UserV2(user.name(), user.age(), user.sex()));
        System.out.println(userV2.orElseThrow());
    }

    public static User defaultUser() {
        System.out.println("Buscando valor default1");
        return new User("Maria", 22, SexEnum.FEMALE);
    }
}
