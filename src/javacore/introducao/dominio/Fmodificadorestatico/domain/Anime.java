package javacore.introducao.dominio.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco  de inicializacao é executado quanto a JVM carregar classes
    // 1 - alocado espaço em memoria pro objeto
    // 2 - Cada atributo de classe é cirado e inicializado com valores default ou o que for passado
    // 3 -Bloco de inicialização é executado
    // 4 - Construtore é executado

    static {
        System.out.println("Bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    } // Bloco de inicialização de instância: ele é executado todas as vezes que o objeto for criado, ele é executado antes do construtor
    // não vai precisar ficar replicando os construtores
    // Independente do construtor que for chamado os episodioss ainda vao estar inicializados
    public Anime(String nome){
        this.nome = nome;
    }
    public Anime(){

        for(int episodios : Anime.episodios){
            System.out.println(episodios + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    /*public void setNome(String nome) {
        this.nome = nome;
    }*/

    public int[] getEpisodios() {
        return episodios;
    }

    /*public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }*/
}
