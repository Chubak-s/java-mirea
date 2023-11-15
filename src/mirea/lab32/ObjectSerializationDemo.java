package mirea.lab32;
import java.io.*;

public class ObjectSerializationDemo {
    public static void main(String[] args) {
        try {
            Customer customer = new Customer();
            customer.setAge(19);
            customer.setFirstName("Chubak");
            customer.setSecondName("Saydinov");
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("customer.ser"));

            outputStream.writeObject(customer);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
