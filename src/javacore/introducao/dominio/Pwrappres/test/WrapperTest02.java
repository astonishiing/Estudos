package javacore.introducao.dominio.Pwrappres.test;

import java.util.ArrayList;
import java.util.List;

public class WrapperTest02 {
    public static void main(String[] args) {
        User user = new User("João", 20);

        printValue(user);
        System.out.println(user);
    }

    private static void printValue(User user) {
        user = new User("Maria" , 33);
        System.out.println(user);

    }
}
