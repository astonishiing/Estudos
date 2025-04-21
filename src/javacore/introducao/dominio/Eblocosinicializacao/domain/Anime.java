package javacore.introducao.dominio.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - alocado espaço em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 -Bloco de inicialização é executado
    // 4 - Construtore é executado

    {
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

        for(int episodios : this.episodios){
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
