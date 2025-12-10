package javacore.introducao.dominio.Vio.Interface.persistence;

import javacore.introducao.dominio.Vio.Interface.FilePersistence;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class IOFilePersistence implements FilePersistence {


    private final String currentDir = System.getProperty("user.dir");
    private final String storedDir = "/managerFile/IO/";
    private final String fileName;

    // Irá pegar o nosso diretório e irar concatenar
    public IOFilePersistence(String fileName) throws IOException{
        this.fileName = fileName;
        File file = new File(currentDir + storedDir);
        if(!file.exists() && !file.mkdirs()){
            throw new IOException("Error ao criar arquvio");
        }

        clearFile();
    }

    @Override
    public String write(String data) {
        try(
                FileWriter fileWrite = new FileWriter(currentDir + storedDir + fileName, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);
                PrintWriter printWriter= new PrintWriter(bufferedWriter)
        ){
            printWriter.println(data);

        }catch (IOException e){
            e.printStackTrace();
        }
        return data;
    }

    @Override
    public boolean removeContent(final String sentence) {
        String findAll = findAll();
        ArrayList<String> contentList = new ArrayList<>(Stream.of(findAll.split(System.lineSeparator())).toList());

        //Verificar se nao está achando nada correspondente
        if(contentList.stream().noneMatch(c -> c.contains(sentence))) return false;

        clearFile();
        contentList.stream()
                .filter(c -> !c.contains(sentence))
                .forEach(this::write);
        return true;
    }

    @Override
    public String replaceCont(final String oldContent, final String newContent) {
        String findAll = findAll();
        ArrayList<String> contentList = new ArrayList<>(Stream.of(findAll.split(System.lineSeparator())).toList());

        if(contentList.stream().noneMatch(c -> c.contains(oldContent))) return "";

        clearFile();
        contentList.stream()
                .map(c -> c.contains(oldContent) ? newContent : c)
                .forEach(this::write);
        return newContent;
    }

    @Override
    public String findAll() {
        StringBuilder stringBuilder = new StringBuilder();
        try( var bufferedReader= new BufferedReader(new FileReader(currentDir + storedDir + fileName))){
            String line;
            do{
                line = bufferedReader.readLine();
                if((line != null)) stringBuilder.append(line)
                        .append(System.lineSeparator());

            }while(line != null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }

    @Override
    public String findBy(final String sentence) {
        var found = "";

        try (BufferedReader bufferedReader= new BufferedReader(new FileReader(currentDir + storedDir + fileName))){
            String line = bufferedReader.readLine();

            while(line != null){

                if((line.contains(sentence))) {
                    found = line;
                    break;
                }
                line = bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return found;
    }

    private void clearFile(){
        //OutputStream é usada para a manipulação do nosso arquivo
        try {
            OutputStream outputStream = new FileOutputStream(new File(currentDir + storedDir + fileName));
            outputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
