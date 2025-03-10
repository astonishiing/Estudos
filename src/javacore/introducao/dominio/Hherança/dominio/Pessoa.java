package javacore.introducao.dominio.Hherança.dominio;

public class Pessoa {
    private String nome;
    private String cof;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCof() {
        return cof;
    }

    public void setCof(String cof) {
        this.cof = cof;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
