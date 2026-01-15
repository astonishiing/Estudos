package javacore.introducao.dominio.ZZEstreams.test;

import javacore.introducao.dominio.ZZEstreams.classes.Contact;
import javacore.introducao.dominio.ZZEstreams.classes.ContactType;
import javacore.introducao.dominio.ZZEstreams.classes.Sex;
import javacore.introducao.dominio.ZZEstreams.classes.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest19 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(generateUsers());

//        users.sort((u1, u2) -> u1.name().compareTo(u2.name()));
//        users.sort(Comparator.comparing(User::name));
        System.out.println("============");
        users.sort(Comparator.comparing(User::name, Comparator.reverseOrder())); // Ordem decrescente

        users.forEach(System.out::println);

        System.out.println("=============");
        List<User> values = users.stream()
                .filter(u -> u.contactList().size() >= 2)
                .toList();

        List<User> values2 = users.stream()
                .filter(u -> u.contactList() != null && u.contactList().isEmpty())
                .toList();

        List<User> values3 = users.stream()
                .filter(u -> u.contactList().stream().anyMatch(contact -> contact.type() == ContactType.EMAIL))
                .toList();

        List<Contact> values4 = users.stream()
                .flatMap(user -> user.contactList().stream())
                .filter(contact -> contact.type() == ContactType.EMAIL)
                .sorted(Comparator.comparing(Contact::desription))
                .toList();


        List<String> value5 = users.stream()
                .flatMap(user -> user.contactList().stream())
                .filter(contact -> contact.type() == ContactType.EMAIL)
                .map(c -> String.format("{\n 'description': '%s',\n   'type': '%s'\n}", c.desription(), c.type()))
                .toList();

        List<Contact> value6 = users.stream()
                .flatMap(user -> user.contactList().stream())
                .filter(contact -> contact.desription().contains("gmail"))
                .toList();

//        var value7 = users.stream()
//                .flatMap(user -> user.contactList().stream())
//                .filter(contact -> contact.type() == ContactType.PHONE)
//                .map(contact -> contact.desription()
//                        .replace("(", "")
//                        .replace(")", "")
//                        .replace("-", ""))
//                        .mapToInt(Integer::parseInt)
//                                .min();

        Map<String, User> value8 = users.stream().filter(user -> user.sex() == Sex.FEMALE)
                .collect(Collectors.toMap(User::name, user -> user));

        values.forEach(System.out::println);
        System.out.println("===========");
        values2.forEach(System.out::println);
        System.out.println("===========");
        values3.forEach(System.out::println);
        System.out.println("==========");
        values4.forEach(System.out::println);
        System.out.println("==========");
        value5.forEach(System.out::println);
        System.out.println("==========");
        value6.forEach(System.out::println);
        System.out.println("==========");
        value8.forEach((key, value) -> System.out.printf("key: %s | value: %s \n", key, value));

    }

    private static List<User> generateUsers() {
        List<Contact> contacts1 = List.of(
                new Contact("(19)90665-8104", ContactType.PHONE),
                new Contact("joao@gmail.com", ContactType.EMAIL)
        );

        List<Contact> contacts2 = List.of(
                new Contact("(21)92121-0032", ContactType.PHONE)
        );

        List<Contact> contacts3 = List.of(
                new Contact("lucas@outlook.com", ContactType.EMAIL)
        );

        List<Contact> contacts4 = List.of(
                new Contact("andreia@outlook.com", ContactType.EMAIL),
                new Contact("andreia@gmail.com", ContactType.EMAIL)
        );

        List<Contact> contacts5 = List.of(
                new Contact("(31)9785-4456", ContactType.PHONE),
                new Contact("(31)9215-0011", ContactType.PHONE)
        );

        User user1 = new User("João", 26, Sex.MALE, new ArrayList<>(contacts1));
        User user2 = new User("Maria", 21, Sex.FEMALE, new ArrayList<>(contacts2));
        User user3 = new User("Lucas", 19, Sex.MALE, new ArrayList<>(contacts3));
        User user4 = new User("Andrei", 40, Sex.FEMALE, new ArrayList<>(contacts4));
        User user5 = new User("Vitor", 30, Sex.MALE, new ArrayList<>(contacts5));
        User user6 = new User("Bruna", 36, Sex.FEMALE, new ArrayList<>());

        return List.of(user1, user2, user3, user4, user5, user6);
    }
}
