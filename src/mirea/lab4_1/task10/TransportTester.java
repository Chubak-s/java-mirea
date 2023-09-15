package mirea.lab4_1.task10;


public class TransportTester {
    public static void main(String[] args) {
        Car car = new Car("Car", 5, 200, 100, 0.1);
        Plane plane = new Plane("Plane", 200, 5000, 1000, 5);
        Train train = new Train("Train", 500, 10000, 200, 1);
        Ship ship = new Ship("Ship", 1000, 20000, 500, 2);

        double distance = 1000;
        int passengers = 100;
        double cargo = 1000;

        System.out.println("Transport: " + car.getName());
        System.out.println("Time: " + car.calculateTime(distance));
        System.out.println("Cost: " + car.calculateCost(passengers, cargo, distance));
        System.out.println();
        System.out.println("Transport: " + plane.getName());
        System.out.println("Time: " + plane.calculateTime(distance));
        System.out.println("Cost: " + plane.calculateCost(passengers, cargo, distance));
        System.out.println();
        System.out.println("Transport: " + train.getName());
        System.out.println("Time: " + train.calculateTime(distance));
        System.out.println("Cost: " + train.calculateCost(passengers, cargo, distance));
        System.out.println();
        System.out.println("Transport: " + ship.getName());
        System.out.println("Time: " + ship.calculateTime(distance));
        System.out.println("Cost: " + ship.calculateCost(passengers, cargo, distance));
    }
}
