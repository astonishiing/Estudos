package javacore.introducao.dominio.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file);
             BufferedWriter br = new BufferedWriter(fw)) {
            br.write("Test 01342");
            br.newLine();
            br.flush();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
