package javacore.introducao.dominio.Zgenerics.domain;

import java.util.Objects;

public class UserDomain extends GenericDomain<Integer>{
    private String name;

    private int age;

    public UserDomain() {
    }

    public UserDomain(Integer id, String name, int age) {
        super(id);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserDomain that = (UserDomain) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age);
    }

    @Override
    public String toString() {
        return "UserDomain{" +
                "id='" + this.getId() + '\'' +
                ", age=" + age +
                '}';
    }
}
