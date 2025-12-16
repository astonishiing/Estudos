package javacore.introducao.dominio.Ycolecoes.Set.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
        conjuntoConvidados.adicionarElemento("Convidado 1", 1234);
        conjuntoConvidados.adicionarElemento("Convidado 2", 1235);
        conjuntoConvidados.adicionarElemento("Convidado 3", 1235);
        conjuntoConvidados.adicionarElemento("Convidado 4", 1221);
        conjuntoConvidados.adicionarElemento("Convidado 5", 1292);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();

    }
}
