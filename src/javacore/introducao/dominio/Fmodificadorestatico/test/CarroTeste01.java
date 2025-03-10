package javacore.introducao.dominio.Fmodificadorestatico.test;

import javacore.introducao.dominio.Fmodificadorestatico.domain.Carro;

public class CarroTeste01 {// o metodo public static void main... ira existir antes do objeto ser criado
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
