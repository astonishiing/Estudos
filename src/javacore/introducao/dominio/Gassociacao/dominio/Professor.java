package javacore.introducao.dominio.Gassociacao.dominio;

public class Professor {
    private String especialidade;
    private String nome;
    private Seminario seminarios;

    public Professor(String nome){
        this.nome = nome;
    }
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String especialidade, String nome, Seminario seminarios) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
