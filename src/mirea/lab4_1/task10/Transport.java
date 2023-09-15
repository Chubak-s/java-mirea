package mirea.lab4_1.task10;

public abstract class Transport {
    private String name;
    private int passengerCapacity;
    private double cargoCapacity;
    private double speed;

    public Transport(String name, int passengerCapacity, double cargoCapacity, double speed) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
        this.speed = speed;
    }

    public abstract double calculateTime(double distance);

    public abstract double calculateCost(int passengers, double cargo, double distance);

    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getSpeed() {
        return speed;
    }
}