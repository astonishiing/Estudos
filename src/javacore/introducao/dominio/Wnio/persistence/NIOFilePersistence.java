package javacore.introducao.dominio.Wnio.persistence;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.stream.Stream;

public class NIOFilePersistence implements FilePersistence{

    private final String currentDir = System.getProperty("user.dir");
    private final String storedDir = "managerFileNIO/NIO";
    private final String fileName;

    public NIOFilePersistence(String fileName) throws IOException{
        this.fileName = fileName;
        File file = new File(currentDir + storedDir);
        if(!file.exists() && !file.mkdirs()) throw new IOException("Error ao criar o arquivo NIO");

        clearFile();
    }


    @Override
    public String write(final String data) {
        try(var file = new RandomAccessFile(new File(currentDir + storedDir + fileName), "rw")){

            file.seek(file.length());
            file.writeBytes(data);
            file.writeBytes(System.lineSeparator());

        }catch (IOException e){
            e.printStackTrace();
        }

        return data;
    }

    @Override
    public boolean removeContent(String sentence) {
        var content = findAll();
        var contentList = Stream.of(content.split(System.lineSeparator())).toList();

        if(contentList.stream().noneMatch(c -> c.contains(sentence)))
            return false;

        clearFile();
        contentList.stream()
                .filter(c -> !c.contains(sentence))
                .forEach(this::write);

        return true;
    }

    @Override
    public String replaceCont(String oldContent, String newContent) {
        return "";
    }

    @Override
    public String findAll() {
        StringBuilder stringBuilder = new StringBuilder();
        try(
                var file = new RandomAccessFile(new File(currentDir + storedDir + fileName), "r");
                var channel = file.getChannel()
        ){
            var buffer = ByteBuffer.allocate(256);
            int bytesReader = channel.read(buffer);
            while(bytesReader != -1){
                buffer.flip();
                while(buffer.hasRemaining()){
                    stringBuilder.append((char) buffer.get());
                }

                buffer.clear();
                bytesReader = channel.read(buffer);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    @Override
    public String findBy(String sentence) {
        var content = new StringBuilder();
        try(
                var file = new RandomAccessFile(new File(currentDir + storedDir + fileName), "r");
                var channel = file.getChannel()
        ){
            var buffer = ByteBuffer.allocate(256);
            int bytesReader = channel.read(buffer);
            while(bytesReader != -1){
                buffer.flip();
                while(buffer.hasRemaining()){
                    while(!content.toString().endsWith(System.lineSeparator())) {
                        content.append((char) buffer.get());
                    }
                    if(content.toString().contains(sentence)) {
                        break;
                    } else {
                        content.setLength(0);
                    }
                    if(!content.isEmpty())
                        break;
                }

                buffer.clear();
                bytesReader = channel.read(buffer);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return content.toString();
    }


    private void clearFile(){
        try(OutputStream outputStream = new FileOutputStream(currentDir + storedDir + fileName)) {

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
