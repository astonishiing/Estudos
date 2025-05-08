package javacore.introducao.dominio.Oexception.exception.test;

import javacore.introducao.dominio.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01{
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner in = new Scanner(System.in);
        String username = "Goku";
        String senha08 = "ssj";
        System.out.println("Usuário");
        String usernameDigitado = in.nextLine();
        System.out.println("Senha");
        String senhaDigitada = in.nextLine();

        if(! username.equals(usernameDigitado) || !senha08.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }
        System.out.println("Usuario logado com sucesso");
    }
}
