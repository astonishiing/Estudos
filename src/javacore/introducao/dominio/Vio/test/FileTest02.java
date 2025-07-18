package javacore.introducao.dominio.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean mkdir = fileDiretorio.mkdir();
        System.out.println("Pasta criada? "+ mkdir);

        File fileAquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        boolean isFileCreated = fileAquivoDiretorio.createNewFile();
        System.out.println("arquivo.txt criado?"+ isFileCreated);

        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileAquivoDiretorio.renameTo(fileRenamed);
        System.out.println("arquivo.txt renoemado?"+ isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDirectoryRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio pasta renomeado? "+isDirectoryRenamed);

//        File fileArquivoDiretorio = new File("C:\\Users\\x\\IdeaProjects\\Estudos\\pasta\\arquivo.txt");
//        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
//        System.out.println(isFileCreated);
    }
}
