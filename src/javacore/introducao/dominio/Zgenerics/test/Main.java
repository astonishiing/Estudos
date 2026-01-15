package javacore.introducao.dominio.Zgenerics.test;

import javacore.introducao.dominio.Zgenerics.dao.ClientDAO;
import javacore.introducao.dominio.Zgenerics.dao.GenericDAO;
import javacore.introducao.dominio.Zgenerics.dao.UserDAO;
import javacore.introducao.dominio.Zgenerics.domain.ClientDomain;
import javacore.introducao.dominio.Zgenerics.domain.UserDomain;

public class Main {
    private static GenericDAO<Integer, UserDomain> userDAO = new UserDAO();
    private static GenericDAO<String, ClientDomain> clientDAO = new ClientDAO();

    public static void main(String[] args) {
        System.out.println("===UserDAO===");
        UserDomain user = new UserDomain(1,"Joao", 36);

        System.out.println(userDAO.count());
        System.out.println(userDAO.save(1, user));

        System.out.println(userDAO.findAll());
        System.out.println(userDAO.find(userDomain -> userDomain.getId().equals(1)));
        System.out.println(userDAO.find(userDomain -> userDomain.getId().equals(2)));
        System.out.println(userDAO.count());

        System.out.println(userDAO.delete(new UserDomain(-1, "",-1)));

        System.out.println(userDAO.delete(user));
        System.out.println(userDAO.findAll());

        System.out.println(userDAO.count());
        System.out.println("===UserDAO(fim)===");



        System.out.println("===ClientDAO===");
        ClientDomain client = new ClientDomain("A","Maria", 21);

        System.out.println(clientDAO.count());
        System.out.println(clientDAO.save(1,client));

        System.out.println(clientDAO.findAll());
        System.out.println(clientDAO.find(userDomain -> userDomain.getId().equals("A")));
        System.out.println(clientDAO.find(userDomain -> userDomain.getId().equals("2")));
        System.out.println(clientDAO.count());

        System.out.println(clientDAO.delete(new ClientDomain("", "",-1)));

        System.out.println(clientDAO.delete(client));
        System.out.println(clientDAO.findAll());

        System.out.println(clientDAO.count());
        System.out.println("===ClientDAO(fim)===");

    }
}
