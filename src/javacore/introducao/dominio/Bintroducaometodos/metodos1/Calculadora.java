package javacore.introducao.dominio.Bintroducaometodos.metodos1;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }
    public void multiplicaDoisNumeros(int num, int num2){
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisao por zero");
            return;
        } //else{}
            System.out.println(num1/num2);
    }
    public void alteraDoisNumeros(int numero1, int numero3){
        numero1 = 99;
        numero3 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("num9: " + numero1);
        System.out.println("num3: " + numero3);
    }
}
