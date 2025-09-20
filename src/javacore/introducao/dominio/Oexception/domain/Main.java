package javacore.introducao.dominio.Oexception.domain;

import javacore.introducao.dominio.Oexception.DAO.UserDAO;
import javacore.introducao.dominio.Oexception.Model.MenuOption;

import java.util.Scanner;

public class Main {

    private static UserDAO userDAO = new UserDAO();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao cadastro de usuários, selecione a operação desejada");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Buscar por identificador");
        System.out.println("5 - Listar");
        System.out.println("6 - Sair");
        var userInput = scanner.nextInt();
        while(true) {
            MenuOption selectedOption = MenuOption.values()[userInput - 1];

        }
    }


}
