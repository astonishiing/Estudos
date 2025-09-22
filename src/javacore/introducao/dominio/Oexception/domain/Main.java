package javacore.introducao.dominio.Oexception.domain;

import javacore.introducao.dominio.Gassociacao.dominio.Local;
import javacore.introducao.dominio.Minterfaces.Interface_Funcional.User;
import javacore.introducao.dominio.Oexception.DAO.UserDAO;
import javacore.introducao.dominio.Oexception.Model.MenuOption;
import javacore.introducao.dominio.Oexception.Model.UserModel;
import javacore.introducao.dominio.Oexception.exception.EmptyStorageException;
import javacore.introducao.dominio.Oexception.exception.UserNotFoundException;
import javacore.introducao.dominio.Oexception.exception.ValidatorException;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import static javacore.introducao.dominio.Oexception.validator.UserValidator.verifyModel;

public class Main {

    private static final UserDAO userDAO = new UserDAO();

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("Bem-vindo ao cadastro de usuários, selecione a operação desejada");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Buscar por identificador");
            System.out.println("5 - Listar");
            System.out.println("6 - Sair");
            var userInput = scanner.nextInt();
            MenuOption selectedOption = MenuOption.values()[userInput - 1];
            switch (selectedOption){
                case SAVE -> {
                    try {
                        UserModel user = userDAO.save(requestToSave());
                        System.out.printf("Usuário cadastrado %s", user);
                    }catch (ValidatorException ex) {
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }

                }

                case UPDATE -> {
                    try {
                        UserModel user = userDAO.update(requestToUpdate());
                        System.out.printf("Usuario atualizado %s", user);
                    }catch (UserNotFoundException | EmptyStorageException ex){
                        System.out.println(ex.getMessage());
                    }catch (ValidatorException ex){
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }
                    finally{
                        System.out.println("================");
                    }
                }

                case DELETE -> {
                    try {
                        userDAO.delete(requestId());
                        System.out.println("Usuario excluído");
                    }catch (UserNotFoundException | EmptyStorageException ex){
                        System.out.println(ex.getMessage());
                    }finally {
                        System.out.println("===============");
                    }
                }

                case FIND_BY_ID -> {
                    try {
                        long id = requestId();
                        UserModel byId = userDAO.findById(id);
                        System.out.printf("Usuário com id %s: ", id);
                        System.out.println(byId);

                    }catch (UserNotFoundException | EmptyStorageException ex){
                        System.out.println(ex.getMessage());
                    }
                }
                case FIND_ALL -> {
                    List<UserModel> all = userDAO.findAll();
                    System.out.println("Usuários cadastrados:");
                    System.out.println("===============");
                    all.forEach(System.out::println);
                    System.out.println("=======fim========");
                }
                case EXIT -> System.exit(0);
            }
        }
    }

    private static long requestId(){
        System.out.println("Informe o identificador do usuário");
        return scanner.nextLong();
    }

    private static UserModel requestToSave() throws ValidatorException {
        System.out.println("Informe o nome do usuário");
        var name = scanner.next();
        System.out.println("Informe o email do usuário");
        var email = scanner.next();
        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy)");
        var birthdayString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);
        UserModel user = new UserModel(0, name, email, birthday);
        return validateInputs(0, name,email, birthday);
    }

    private static UserModel validateInputs(final long id, final String name, final String email, final LocalDate birthday) throws ValidatorException{
        var user = new UserModel(0, name, email, birthday);
        verifyModel(user);
        return user;
    }

    private static UserModel requestToUpdate() throws ValidatorException {
        System.out.println("Informe o identificador do usuário");
        var id = scanner.nextLong();

        System.out.println("Informe o nome do usuário");
        var name = scanner.next();

        System.out.println("Informe o email do usuário");
        var email = scanner.next();

        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy)");
        var birthdayString = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);

        return validateInputs(0, name,email, birthday);
    }

}
