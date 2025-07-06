package javacore.introducao.dominio.Xserializacao.dominio;

import java.io.Serializable;

public class Aluno implements Serializable {
    private long id;
    private String nome;
    private String password;

    public Aluno(long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }
    @Override
    public String toString(){
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password=" + password + '\'' +
                "}";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
