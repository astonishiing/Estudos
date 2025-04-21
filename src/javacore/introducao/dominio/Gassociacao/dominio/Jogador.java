package javacore.introducao.dominio.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;
    // O jogador deve se cadastrar caso tenha um time colocar o Time no construtor
    //Caso o jogador pode se cadastrar e depois escolher o time, pode deixar o Time vazio
    public void imprime() {
        System.out.println(this.nome);
        if(time != null){
            System.out.println(time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
