package javacore.introducao.dominio.Ycolecoes.Pesquisa;

public class Main {
    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivro.adicionarLivro("Livro 1", "Autor 2", 2020);
        catalogoLivro.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogoLivro.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalogoLivro.adicionarLivro("Livro 4", "Autor 3", 2023);
        catalogoLivro.adicionarLivro("Livro 5", "Autor 4", 1999);
        catalogoLivro.adicionarLivro("Livro 6", "Autor 5", 1980);

        System.out.println("===============");
        System.out.println(catalogoLivro.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivro.pesquisarPorAutor("Autor 4"));
        System.out.println("===============");
        System.out.println(catalogoLivro.pesquisaPorIntervalosAnos(2020, 2022));
        System.out.println("===============");
        System.out.println(catalogoLivro.pesquisarPorTitulo("Livro 1"));
    }
}
