package mirea.lab32;
import java.io.*;

public class ObjectDemo {
    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("customer.ser"));
            Customer customer = (Customer) inputStream.readObject();
            inputStream.close();
            System.out.println("Deserialized Customer: " + customer);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}