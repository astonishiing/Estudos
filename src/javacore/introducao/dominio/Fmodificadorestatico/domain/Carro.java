package javacore.introducao.dominio.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;
    // Inicializando os atributos diretamente na classe Carro,
    // o que significa que todos os objetos que criarmos irá ter velocidade limite de 250 km/k

    public Carro(){

    }
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println("Nome" + this.nome);
        System.out.println("velocidade Maxima" + this.velocidadeMaxima);
        System.out.println("velocidade Limite" + Carro.velocidadeLimite);
    }
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }// Esta dando uma atribuição de valores para ele mesmo
    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    } // Nesse caso pode tirar
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /*public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }*/
}
