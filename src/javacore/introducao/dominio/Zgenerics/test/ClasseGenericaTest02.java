package javacore.introducao.dominio.Zgenerics.test;

import javacore.introducao.dominio.Zgenerics.domain.Barco;
import javacore.introducao.dominio.Zgenerics.domain.Carro;
import javacore.introducao.dominio.Zgenerics.service.BarcoRentavelService;
import javacore.introducao.dominio.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o carro por um mês...");
        barcoRentavelService.retornarCarroAlugado(barco);
    }
}
