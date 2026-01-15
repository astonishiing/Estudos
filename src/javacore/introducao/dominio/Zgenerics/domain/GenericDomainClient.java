package javacore.introducao.dominio.Zgenerics.domain;

public interface GenericDomainClient<T> {
    T getId();

    void setId(T id);
}
