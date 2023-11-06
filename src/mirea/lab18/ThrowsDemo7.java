package mirea.lab18;
import java.util.Scanner;

public class ThrowsDemo7 {
    public static void getKey() /*throws Exception */{
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.nextLine();
        printDetails(key);
    }
    public static void printDetails(String key) /*throws Exception*/ {
        try { String message = getDetails(key);
            System.out.println( message );
        } catch (Exception e){
            throw new RuntimeException("ошибка");
        }
    }
    public static String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key; }

    public static void main(String[] args) {
        getKey();
    }
}
