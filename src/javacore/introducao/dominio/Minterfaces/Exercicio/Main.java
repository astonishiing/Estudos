package javacore.introducao.dominio.Minterfaces.Exercicio;

import java.util.Scanner;

public class Main {
    private final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        GeometricForm geometricForm = null;
        while(true){
            System.out.println("Escolha a forma geometrica para calcular a area");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("4 - Sair do programa");
            option = input.nextInt();
            if(option == 1){
                geometricForm = createSquare();
            } else if(option == 2){
                geometricForm = createRectangle();
            } else if(option == 3){
                geometricForm = createCircle();
            }else if(option == 4){
                break;
            }else {
                System.out.println("Opção inválida");
                continue;
            }
            System.out.println("A area do calculo da area foi de: " + geometricForm.getArea());
        }
    }
    private static GeometricForm createSquare(){
        System.out.println("Informe os tamanhos dos lados");
        var side = input.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle(){
        System.out.println("Informe o tamnaho da base");
        var base = input.nextDouble();
        System.out.println("Informe o tamanho da altura");
        var height = input.nextDouble();
        return new Rectangle(height,base);
    }
    private static GeometricForm createCircle(){
        System.out.println("Informe o raio do ciruculo");
        var radius = input.nextDouble();
        return new Circle(radius);
    }
}
