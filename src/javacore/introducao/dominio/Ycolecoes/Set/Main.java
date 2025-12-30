package javacore.introducao.dominio.Ycolecoes.Set;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Set<User> userSet = new HashSet<>();
        userSet.add(new User(1, "João"));
        userSet.add(new User(2, "Maria"));
        userSet.add(new User(3, "Juca"));
        userSet.add(new User(4, "Leo"));

        System.out.println(new User(1, "João").equals(new User(1, "João")));

        System.out.println(userSet.contains(new User(1, "João")));

        System.out.println(new User(1, "João").hashCode());

        userSet.forEach(System.out::println);
        System.out.println("=========");

        for (User user : userSet) {
            System.out.println(user);
        }

        System.out.println("=========");
        userSet.removeAll(List.of(new User(1, "João"), new User(2, "Lucas")));
        System.out.printf(userSet.toString());

        System.out.println("=========");
        userSet.removeIf(user -> user.getId() == 3);
        System.out.println(userSet.toString());

        System.out.println("===========");
        userSet.removeIf(Predicate.not(user -> user.getId() == 4));
        System.out.println(userSet);

        System.out.println("=======TreeSet========");
        Set<User> userTreeSet = new TreeSet<>((o1, o2) -> {
            var compareResult = 0;
            if (o1.getId() < o2.getId()) compareResult --;
            if (o1.getId() > o2.getId()) compareResult ++;

            return compareResult;
        });
        userSet.add(new User(1, "João"));
        userSet.add(new User(2, "Maria"));
        userSet.add(new User(3, "Juca"));
        userSet.add(new User(4, "Leo"));


        Set<User> userTreeSet1 = new TreeSet<>(Comparator.comparingInt(User::getId).reversed());
        userSet.add(new User(1, "João"));
        userSet.add(new User(2, "Maria"));
        userSet.add(new User(3, "Juca"));
        userSet.add(new User(4, "Leo"));


    }
}
