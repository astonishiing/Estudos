package javacore.introducao.dominio.Xserializacao.test;

import javacore.introducao.dominio.Xserializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "WillianSuane", "123412121");
        serializar(aluno);
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
