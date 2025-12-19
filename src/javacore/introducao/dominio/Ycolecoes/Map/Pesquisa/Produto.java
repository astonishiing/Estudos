package javacore.introducao.dominio.Ycolecoes.Map.Pesquisa;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //Nesse caso não irá precisar sobrescrever o equal() e o HashCode(), pois minha chave irá conter um valor único. Então dentro do map irei ter elementos únicos


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
