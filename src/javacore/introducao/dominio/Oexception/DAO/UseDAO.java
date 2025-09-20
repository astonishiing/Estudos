package javacore.introducao.dominio.Oexception.DAO;

import javacore.introducao.dominio.Oexception.Model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UseDAO {

    //Contador
    private long nextId = 1L;

    private final List<UserModel> models = new ArrayList<>();

    public UserModel save(final UserModel model){
        model.setId(nextId++);
        models.add(model);
        return model;
    }

    public UserModel update(final UserModel model){

    }

    public UserModel findById(final long id){
        models.stream().filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow();

    }
}
