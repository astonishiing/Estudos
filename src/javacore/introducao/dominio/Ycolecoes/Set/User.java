package javacore.introducao.dominio.Ycolecoes.Set;

import javax.print.MultiDocPrintService;
import java.util.Comparator;
import java.util.Objects;

import static java.util.Objects.hash;
import static java.util.Objects.isNull;

//implements Comparable<User>
public class User {

    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if ((isNull(obj)) || (!(obj instanceof User user))) return false;

        return this.id == user.getId() && Objects.equals(user.getName(), this.name);
    }

    @Override
    public int hashCode() {
        return hash(this.id, this.name);
    }

//    @Override
//    public int compareTo(User user) {
//        var compareResult = 0;
//        if ( this.id < user.id) compareResult --;
//        if ( this.id > user.id) compareResult ++;
//
//        return compareResult;
//    }
}
