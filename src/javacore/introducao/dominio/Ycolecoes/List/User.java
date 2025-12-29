package javacore.introducao.dominio.Ycolecoes.List;

import java.util.Objects;

public class User {

    private int code;

    private String name;

    public User() {
    }

    public User(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object obj) {
        var isEquals = false;
        if (obj instanceof User user) {
            if (this == user){
                return true;
            }
            if (this.code == user.code && Objects.equals(this.name, user.name)){
                return true;
            }

        }
        return isEquals;
    }

    @Override
    public String toString() {
        return "User{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
