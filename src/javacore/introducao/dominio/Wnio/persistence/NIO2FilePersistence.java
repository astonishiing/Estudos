package javacore.introducao.dominio.Wnio.persistence;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIO2FilePersistence implements FilePersistence{
    private final String currentDir = System.getProperty("user.dir");
    private final String storedDir = "managerFileNIO/NIO2";
    private final String fileName;

    public NIO2FilePersistence(String fileName) throws IOException{
        this.fileName = fileName;
        var path = Paths.get(currentDir + storedDir);

        if(Files.exists(path)){
            Files.createDirectory(path);
        }
        clearFile();
    }


    @Override
    public String write(String data) {
        return "";
    }

    @Override
    public boolean removeContent(String sentence) {
        return false;
    }

    @Override
    public String replaceCont(String oldContent, String newContent) {
        return "";
    }

    @Override
    public String findAll() throws IOException {
        return "";
    }

    @Override
    public String findBy(String sentence) {
        return "";
    }

    private void clearFile(){
        try(OutputStream outputStream = new FileOutputStream(currentDir + storedDir + fileName)) {

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
