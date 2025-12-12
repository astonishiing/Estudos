package javacore.introducao.dominio.Wnio.persistence;

public class NIORunningTest {
    public static void main(String[] args) throws Exception {
        FilePersistence persistence = new NIOFilePersistence("user.csv");
        System.out.println(persistence.write("bianca;bia@bia.com;22/09/1997;"));
        System.out.println("=================");
        System.out.println(persistence.write("bernardo;bernado@bernado.com;28/11/1999;"));
        System.out.println("=================");
        System.out.println(persistence.write("ricardo;ricardo@ricardo.com;12/01/2000;"));
        System.out.println("=================");
        System.out.println(persistence.findAll());
        System.out.println("=================");

        System.out.println(persistence.findBy(";bia@"));
        System.out.println("=================");
        System.out.println(persistence.findBy("ricardo"));

    }
}
