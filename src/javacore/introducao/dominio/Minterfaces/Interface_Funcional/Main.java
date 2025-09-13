package javacore.introducao.dominio.Minterfaces.Interface_Funcional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Maria", 21), new User("Joao", 32), new User("Eduardo", 40)
            , new User("Ana", 19));

           printStringValues( user -> String.valueOf(user.age()),users);
    }
    private static void printStringValues(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));

    }
}
