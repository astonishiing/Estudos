package javacore.introducao.dominio.Jmodificadorfinal.test;

import javacore.introducao.dominio.Isobrescrita.dominio.Comprador;
import javacore.introducao.dominio.Jmodificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        // System.out.println(carro.VELOCIDADE_LIMITE);
    }
}
