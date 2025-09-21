package javacore.introducao.dominio.Oexception.validator;

import javacore.introducao.dominio.Oexception.Model.UserModel;
import javacore.introducao.dominio.Oexception.exception.ValidatorException;

public class UserValidator {

    private UserValidator(){

    }

    public static void VerifyModel(final UserModel model) throws ValidatorException{

        if(stringIsBlank(model.getName()))
            throw new ValidatorException("Informe um nome válido");
        if(model.getName().length() <= 1)
            throw new ValidatorException("O nome deve ter pelo mais que 1 caracter");
        if(stringIsBlank(model.getEmail()))
            throw new ValidatorException("Informe um email válido");
        if((!model.getEmail().contains("@")) && (model.getEmail().contains("."))){
            throw new ValidatorException("Informe um email valido");
        }
    }

    private static boolean stringIsBlank(final String value){
        return value == null || value.isBlank();
    }

}
