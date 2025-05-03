package javacore.introducao.dominio.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }

    //public final double VELOCIDADE_LIMITE = 250;
    public static final double VELOCIDADE_LIMITE = 250;
    // public final double VELOCIDADE_LIMITE
    /*
    * {
    * VELOCIDA_LIMITE = 250
    * }
    *
    * */

    /* (OR) public Carro() {
        VELOCIDADE_LIMITE = 250
    } Nesse caso é apenas se fosse static */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
