package javacore.introducao.dominio.Ycolecoes.dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private Long id;
    private String nome;

    public Consumidor(String nome){
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000); // ID vai ser auto_gerado
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String getNome() {
        return nome;
    }
}
