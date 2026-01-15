package javacore.introducao.dominio.Zgenerics.dao;

import javacore.introducao.dominio.Zgenerics.domain.GenericDomain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public abstract class GenericDAO<ID, T extends GenericDomain<ID>> {
    private final List<T> db = new ArrayList<>();

    private T save(T domain) {
        db.add(domain);
        return domain;
    }

    public boolean save(int batch,T... domains) {
        System.out.printf("Salvando em lote(%s) \n", batch);
        return db.addAll(Arrays.stream(domains).toList());
    }

    public T update(ID id, T domain) {
        T stored = find(t -> t.getId().equals(id)).orElseThrow();

        db.remove(stored);
        db.add(domain);
        return save(domain);
    }

    public boolean delete(T domain) {
        return db.remove(domain);
    }

    public Optional<T> find(Predicate<T> filterCAllBack) {
        return db.stream().filter(filterCAllBack).findFirst();
    }

    public List<T> findAll() {
        return db;
    }

    public int count() {
        return db.size();
    }

}
