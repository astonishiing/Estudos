package javacore.introducao.dominio.Ycolecoes.Map.Pesquisa;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProduto();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 2, 15.0);

        estoqueProdutos.exibirProduto();

        System.out.println("=============");
        System.out.println("Valor total de estoque R$: " + estoqueProdutos.calculaValorTotalEstoque());
        System.out.println("=============");
        System.out.println("Valor total de estoque R$: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
