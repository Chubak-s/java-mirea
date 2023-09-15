package mirea.lab2.task4;

public class Computer {
    private int id;
    private String model;

    public Computer( int id, String model ) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }
}
