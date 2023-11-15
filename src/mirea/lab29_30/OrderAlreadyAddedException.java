package mirea.lab29_30;

public class OrderAlreadyAddedException extends RuntimeException{
    public OrderAlreadyAddedException() {
        super("Order already added for the table or address.");
    }
}
