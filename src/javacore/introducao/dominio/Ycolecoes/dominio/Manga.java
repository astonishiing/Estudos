package javacore.introducao.dominio.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preço;
    private int quantidade;

    public Manga(Long id, String nome, double preço) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);
        Objects.requireNonNull(preço);

        this.id = id;
        this.nome = nome;
        this.preço = preço;
    }

    public Manga(Long id, String nome, double preço, int quantidade) {
        this(id, nome, preço);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Manga manga = (Manga) o;
//        return Double.compare(preço, manga.preço) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, nome, preço);
//    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preço=" + preço +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {

        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    @Override
    public int compareTo(Manga outroManga) {
        // negative se o this < outroManga
        // se this == outroManga return 0
        // positivo se o this > outroManga
//        if (this.id < outroManga.getId()) {
//            return -1;
//        } else if (this.id.equals(outroManga.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }
        return this.nome.compareTo(outroManga.getNome());
//        return Double.compare(preço, outroManga.getPreço());
//        return this.id.compareTo(outroManga.getId()); //essas sintaxes estão certas

    }
}
