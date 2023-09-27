package Strategy;

import Strategy.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.changeDrivingMode("Eco");

        System.out.print("Mode eco consumption:");
        System.out.println(car.carConsumption(45,25));

        car.changeDrivingMode("Comfort");

        System.out.print("Mode comfort consumption: ");
        System.out.println(car.carConsumption(45,25));

        car.changeDrivingMode("Sport");

        System.out.print("Mode sport consumption: ");
        System.out.println(car.carConsumption(45,25));

        System.out.print("Mode sport consumption: ");
        System.out.println(car.carConsumption(120,40));

    }
}