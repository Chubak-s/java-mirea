package mirea.lab18;

import java.util.Scanner;

public class ThrowsDemo8 {
    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.nextLine();
        printDetails(key);
    }

    public static void printDetails(String key) {
        boolean isValidKey = false;
        while (!isValidKey) {
            try {
                String message = getDetails(key);
                System.out.println(message);
                isValidKey = true;
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
                System.out.println("Enter key again:");
                Scanner myScanner = new Scanner(System.in);
                key = myScanner.next();
            }
        }
    }

    private static String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        getKey();
    }
}
