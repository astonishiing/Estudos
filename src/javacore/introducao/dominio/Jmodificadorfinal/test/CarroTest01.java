package javacore.introducao.dominio.Jmodificadorfinal.test;

import javacore.introducao.dominio.Jmodificadorfinal.dominio.Comprador;
import javacore.introducao.dominio.Jmodificadorfinal.dominio.Carro;
import javacore.introducao.dominio.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        //Comprador comprador2 = new Comprador();
        //carro.Comprador = comprador2 > Nesse caso nao pode mudar a referência do objeto, nem mesmo criando um novo objeto

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        // System.out.println(carro.VELOCIDADE_LIMITE); nesse caso é apenas se nos declararmos
        // que o atributo seja public final e a criação de um bloco de iniciazaliação não estatico
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
