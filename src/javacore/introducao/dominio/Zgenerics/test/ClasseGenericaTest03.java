package javacore.introducao.dominio.Zgenerics.test;

import javacore.introducao.dominio.Zgenerics.domain.Barco;
import javacore.introducao.dominio.Zgenerics.domain.Carro;
import javacore.introducao.dominio.Zgenerics.service.BarcoRentavelService;
import javacore.introducao.dominio.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedez"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate"), new Barco("Canoa")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);

        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("---------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
