package javacore.introducao.dominio.ZZEstreams.classes;

import java.util.List;

public record User(String name, int age, Sex sex, List<Contact> contactList) {
}
