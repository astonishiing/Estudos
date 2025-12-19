package javacore.introducao.dominio.Ycolecoes.Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();
        agendaEvento.adicionarEvento(LocalDate.of(2022, Month.AUGUST, 15), "Evento 1", "Atracao 1");
        agendaEvento.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atracao 2");
        agendaEvento.adicionarEvento(LocalDate.of(2025, 12, 21), "Evento 3", "Atracao 3");
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 20), "Evento 4", "Atracao 4");

        agendaEvento.exibirAgenda();

        agendaEvento.obterProximoEvento();
    }
}
