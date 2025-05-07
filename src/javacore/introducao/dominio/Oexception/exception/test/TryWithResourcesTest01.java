package javacore.introducao.dominio.Oexception.exception.test;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
