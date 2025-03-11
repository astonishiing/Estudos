package javacore.introducao.dominio.Hherança.dominio;

public class Funcionario extends Pessoa { ;
    private double salario;

    public Funcionario(String nome){
        super(nome); // obrigatoriamente precisa passar o nome
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
