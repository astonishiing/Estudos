package javacore.introducao.dominio.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Test 01342");
            fw.flush();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
