package javacore.introducao.dominio.Oexception.exception.test;

import javacore.introducao.dominio.Oexception.exception.domain.Leitor1;
import javacore.introducao.dominio.Oexception.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest02 {
    public static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){
            e.printStackTrace();
        }
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
