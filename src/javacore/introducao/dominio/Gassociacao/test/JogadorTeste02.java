package javacore.introducao.dominio.Gassociacao.test;

import javacore.introducao.dominio.Gassociacao.dominio.Jogador;
import javacore.introducao.dominio.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Selecao Brasileira");
        jogador1.setTime(time);

        jogador1.imprime();
    }
}
