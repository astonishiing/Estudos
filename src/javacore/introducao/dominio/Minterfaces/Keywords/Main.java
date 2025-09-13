package javacore.introducao.dominio.Minterfaces.Keywords;

import javaintroducao.Aula06EstruturaDeRepeticao;

public class Main {
    public static void main(String[] args) {
        var client = new Client();
        client.setName("name");
        Client.setStaticname("staticName");

        System.out.println(client.getName());
        System.out.println(Client.getStaticname());

        System.out.println("=======");
        var client2 = new Client();

        System.out.println(Client.getStaticname());
    }
}
