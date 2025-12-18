package javacore.introducao.dominio.Ycolecoes.Map.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Ana", 123456);
        agendaContatos.adicionarContato("Ana", 5665);
        agendaContatos.adicionarContato("Ana Cavalcante", 111111);
        agendaContatos.adicionarContato("Ana Silva", 654987);
        agendaContatos.adicionarContato("Duda Silva", 111111);
        agendaContatos.adicionarContato("Ana", 44444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Duda Silva");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Ana Silva"));
    }
}
