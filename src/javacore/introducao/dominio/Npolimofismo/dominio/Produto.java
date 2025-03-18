package javacore.introducao.dominio.Npolimofismo.dominio;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

}
