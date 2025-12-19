package javacore.introducao.dominio.Ycolecoes.Map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEvento {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate date, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(date, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        // O que há de semelhante com eles é, que nenhum deles se conhecem; Elas são coleções independentes
        //Set<LocalDate> localDates = eventoMap.keySet(); // Ele está me retornando um set com todas as Keys
        //Collection<Evento> values = eventoMap.values(); // Me retornar uma coleção com todos os valores

        LocalDate now = LocalDate.now();
        LocalDate afterDate = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if(entry.getKey().isEqual(now) || entry.getKey().isAfter(now)) {
                afterDate = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + afterDate);
                break;
            }
        }
    }
}
