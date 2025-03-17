package javacore.introducao.dominio.Knum.test;
import javacore.introducao.dominio.Knum.dominio.Cliente;
import javacore.introducao.dominio.Knum.dominio.TipoCliente;
import javacore.introducao.dominio.Knum.dominio.TipoPagemento;


public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagemento.DEBITO); // Nao podemos mais passar uma String
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, TipoPagemento.CREDITO);
        //Cliente cliente4 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        //Cliente cliente3 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagemento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagemento.CREDITO.calcularDesconto(100));
        TipoCliente Tipocliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(Tipocliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.TipoClienteForNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }




}
