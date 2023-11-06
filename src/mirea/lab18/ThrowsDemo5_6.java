package mirea.lab18;

public class ThrowsDemo5_6 {
    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "Your text is: " + key;
    }

    public static void main(String[] args) {
        printMessage("gh");
    }
}
