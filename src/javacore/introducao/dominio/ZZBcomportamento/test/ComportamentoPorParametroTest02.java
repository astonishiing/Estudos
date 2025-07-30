package javacore.introducao.dominio.ZZBcomportamento.test;

import javacore.introducao.dominio.ZZBcomportamento.dominio.Car;
import javacore.introducao.dominio.ZZBcomportamento.interfacce.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("Black", 1980), new Car("red", 2019));


    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });
        System.out.println(greenCars);
    }

    private static List<Car> filter (List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }


}


