package javacore.introducao.dominio.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutPutStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pastaWnio/arquivo.zip");
        Path arquivoParaZipar = Paths.get("pastaWnio/subpasta1/subsubpasta1");
        zip(arquivoZip, arquivoParaZipar);
    }
    private static void zip(Path arquivoZip, Path arquivoParaZipar){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoParaZipar)){

            for(Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
                //System.out.println(file.getFileName());
            }
            System.out.println("Arquivo criado com sucesso");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
