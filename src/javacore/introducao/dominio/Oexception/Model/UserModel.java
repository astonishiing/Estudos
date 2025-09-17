package javacore.introducao.dominio.Oexception.Model;

import java.time.OffsetDateTime;

public record UserModel(long id, String name, String email, OffsetDateTime birthday)  {
}
