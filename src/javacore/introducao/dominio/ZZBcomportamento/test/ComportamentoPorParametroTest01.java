package javacore.introducao.dominio.ZZBcomportamento.test;

import javacore.introducao.dominio.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("Black", 1980), new Car("red", 2019));


    public static void main(String[] args) {
        System.out.println(filterGreeCar(cars));
        System.out.println(filterByCar(cars, "Black"));
        System.out.println(filterByCar(cars, "red"));
    }

    private static List<Car> filterGreeCar(List<Car> cars) {
        List<Car> greeCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                greeCars.add(car);
            }
        }
        return greeCars;
    }

    private static List<Car> filterByCar(List<Car> cars, String cor) {
        List<Car> greeCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                greeCars.add(car);
            }
        }
        return greeCars;
    }
}


