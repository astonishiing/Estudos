package javacore.introducao.dominio.Vio.Interface.persistence;

import javacore.introducao.dominio.Vio.Interface.FilePersistence;

import java.io.*;

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
    public boolean removeContent(String sentence) {
        return false;
    }

    @Override
    public String replaceCont(String oldContent, String newContent) {
        return "";
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
    public String findBy(String sentence) {
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
