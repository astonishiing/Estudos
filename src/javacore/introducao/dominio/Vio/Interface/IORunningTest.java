package javacore.introducao.dominio.Vio.Interface;

import javacore.introducao.dominio.Vio.Interface.persistence.IOFilePersistence;

import java.io.IOException;

public class IORunningTest {
    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new IOFilePersistence("user.txt");
        System.out.println(persistence.write("Lucas;lucas@lucas.com;123456789;15/01/1990"));
    }
}
