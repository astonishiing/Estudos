package javacore.introducao.dominio.Minterfaces.Exercicio;

public record Square(int side) implements GeometricForm {

    @Override
    public double getArea() {
        return side * side;
    }
}
