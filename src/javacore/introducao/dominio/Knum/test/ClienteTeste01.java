package javacore.introducao.dominio.Knum.test;

import javacore.introducao.dominio.Jmodificadorfinal.dominio.TipoCliente;
import javacore.introducao.dominio.Knum.dominio.Cliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA); // Nao podemos mais passar uma String
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }




}
