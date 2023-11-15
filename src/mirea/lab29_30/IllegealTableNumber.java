package mirea.lab29_30;

public class IllegealTableNumber extends RuntimeException{
    public IllegealTableNumber() {
        super("Invalid table number.");
    }
}
