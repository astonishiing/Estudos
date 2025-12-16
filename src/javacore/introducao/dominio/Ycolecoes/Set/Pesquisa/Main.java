package javacore.introducao.dominio.Ycolecoes.Set.Pesquisa;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Wagner", 123456);
        agendaContatos.adicionarContato("Wagner", 5644);
        agendaContatos.adicionarContato("Wagner Alves", 111111);
        agendaContatos.adicionarContato("Duda", 654987);
        agendaContatos.adicionarContato("Maria", 111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Wagner"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria", 232123));

        agendaContatos.exibirContato();
    }
}
