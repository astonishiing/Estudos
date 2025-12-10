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
        return "";
    }

    @Override
    public String findBy(String sentence) {
        return "";
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
