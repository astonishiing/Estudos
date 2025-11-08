package javacore.introducao.dominio.Hherança.dominio;

public class Pessoa {
    //private String nome;
    //private String cpf;
    //private Endereco endereco
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static{
        System.out.println("Dentro do bloco estático da pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 1 ");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 2 ");
    }
    public Pessoa(){

    }

    public Pessoa(String nome){
        System.out.println("Debtri di construtor de pessoa");
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cof) {
        this.cpf = cof;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
