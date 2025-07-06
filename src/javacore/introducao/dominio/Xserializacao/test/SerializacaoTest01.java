package javacore.introducao.dominio.Xserializacao.test;

import javacore.introducao.dominio.Xserializacao.dominio.Aluno;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "WillianSuane", "123412121");
        //serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream ObjectInputStream = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ObjectInputStream.readObject();
            System.out.println(aluno);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
