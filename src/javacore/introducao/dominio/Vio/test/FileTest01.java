package javacore.introducao.dominio.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " +isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Path absolute " + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("Is hidden " + file.isHidden());
            System.out.println("last mmodified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean existis = file.exists();
            if (existis){
                System.out.println("Deleted"+file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
