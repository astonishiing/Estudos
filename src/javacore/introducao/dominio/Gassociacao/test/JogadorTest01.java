package javacore.introducao.dominio.Gassociacao.test;

import javacore.introducao.dominio.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = {jogador1,  jogador2, jogador3};
        //O array vai fazer referencia pra um mesmo objeto, que esta referenciando
        for (Jogador jogador : jogadores){
            jogador.imprime();
        }

    }
}
