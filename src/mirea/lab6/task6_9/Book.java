package mirea.lab6.task6_9;

public class Book implements Printable{
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }
    @Override
    public void print() {
        System.out.println("Название - " + name +
                ", цена - " + price + ", автор - " + author);
    }
}
