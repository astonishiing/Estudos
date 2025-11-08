package javacore.introducao.dominio.Hheranca.dominio;

public class Funcionario extends Pessoa { ;
    private double salario;

    static{
        System.out.println("Dentro do bloco estático do Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1 ");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2 ");
    }
    public Funcionario(){
        super();
    }

    public Funcionario(String nome){
        super(nome); // obrigatoriamente precisa passar o nome
        System.out.println("Dentro do construtor de funcionário");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu" + this.nome + "Recebi o salario de: " + this.salario);
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }

}
