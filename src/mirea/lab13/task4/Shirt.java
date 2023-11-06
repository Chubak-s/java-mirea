package mirea.lab13.task4;

public class Shirt {
    private String id;
    private String model;
    private String color;
    private String size;
    public Shirt(String id, String model, String color, String size){
        this.id = id;
        this.model = model;
        this.color = color;
        this.size = size;
    }
    public String toString(){
        return "артикул: " + id + " модель: " + model + " цвет: " + color + " размер: " + size;
    }
}
