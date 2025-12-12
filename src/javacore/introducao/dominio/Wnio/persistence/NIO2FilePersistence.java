package javacore.introducao.dominio.Wnio.persistence;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;

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
    public String write(final String data) {
        var path = Paths.get(currentDir + storedDir + fileName);

        try {
            Files.write(path, data.getBytes(), StandardOpenOption.APPEND);
            Files.write(path, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);

        }catch (IOException e){
            e.printStackTrace();
        }
        return data;
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
        var path = Paths.get(currentDir + storedDir + fileName);
        var content = "";
        try (var lines = Files.lines(path)){
            content = lines.collect(Collectors.joining(System.lineSeparator()));
        }catch (IOException e){
            e.printStackTrace();
        }
        return content;
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
